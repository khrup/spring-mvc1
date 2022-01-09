package hello.servlet.web.springmvc.v2;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRespository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/springmvc/v2/members")
public class SpringMemberControllerV2 {

    private MemberRespository memberRespository = MemberRespository.getInstance();

    @RequestMapping("/new-form")
    public ModelAndView proccess(){
        ModelAndView modelAndView = new ModelAndView("new-form");
        return modelAndView;
    }

    @RequestMapping("/save")
    public ModelAndView process(@RequestParam Map<String, String> paramMap){

        ModelAndView modelAndView = new ModelAndView("save-result");

        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRespository.save(member);

        modelAndView.addObject("member", member);
        return modelAndView;

    }

    @RequestMapping
    public ModelAndView process(){
        ModelAndView modelAndView = new ModelAndView("members");
        modelAndView.addObject("members", memberRespository.findAll());
        return modelAndView;
    }
}
