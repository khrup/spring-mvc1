package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequestMapping("/springmvc/v1/members")
public class SpringMemberFormControllerV1 {

    @GetMapping("/new-form")
    public ModelAndView proccess(){
        ModelAndView modelAndView = new ModelAndView("new-form");
        return modelAndView;
    }


}
