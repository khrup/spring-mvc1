package hello.servlet.web.springmvc.v1;

import hello.servlet.domain.member.MemberRespository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMemberListControllerV1 {

    private MemberRespository memberRespository = MemberRespository.getInstance();

    @RequestMapping("/springmvc/v1/members")
    public ModelAndView process(){
        ModelAndView modelAndView = new ModelAndView("members");
        modelAndView.addObject("members", memberRespository.findAll());
        return modelAndView;
    }
}
