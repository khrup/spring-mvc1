package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRespository;
import hello.servlet.web.frontcontroller.ControllerV4;

import java.util.Map;

public class MemberSaveControllerV4 implements ControllerV4 {

    private MemberRespository memberRespository = MemberRespository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> modelMap) {
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRespository.save(member);

        modelMap.put("member", member);
        return "save-result";
    }
}
