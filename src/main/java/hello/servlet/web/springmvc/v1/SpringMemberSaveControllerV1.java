package hello.servlet.web.springmvc.v1;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRespository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class SpringMemberSaveControllerV1 {

    private MemberRespository memberRespository = MemberRespository.getInstance();

    @RequestMapping("/springmvc/v1/members/save")
    public ModelAndView process(@RequestParam Map<String, String> paramMap){

        ModelAndView modelAndView = new ModelAndView("save-result");

        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRespository.save(member);

        modelAndView.addObject("member", member);
        return modelAndView;

    }
}
