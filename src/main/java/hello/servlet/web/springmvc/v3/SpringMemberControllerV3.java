package hello.servlet.web.springmvc.v3;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRespository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/springmvc/v3/members")
public class SpringMemberControllerV3 {
    private MemberRespository memberRespository = MemberRespository.getInstance();

    @GetMapping(value = "/new-form")
    public String newForm(){
        return "new-form";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestParam("username") String username,
                             @RequestParam("age") int age,
                             Model model){

        Member member = new Member(username, age);
        memberRespository.save(member);

        model.addAttribute("member", member);
        return "save-result";

    }

    @RequestMapping(method = RequestMethod.GET)
    public String members(Model model){
        model.addAttribute("members", memberRespository.findAll());
        return "members";
    }

}
