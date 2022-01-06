package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRespository;
import hello.servlet.web.frontcontroller.ControllerV4;
import hello.servlet.web.frontcontroller.ModelView;

import java.util.List;
import java.util.Map;

public class MemberListControllerV4 implements ControllerV4 {

    private MemberRespository memberRespository = MemberRespository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        model.put("members", memberRespository.findAll());
        return "members";
    }
}
