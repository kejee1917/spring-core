package hello.temp;

import hello.temp.member.Grade;
import hello.temp.member.Member;
import hello.temp.member.MemberService;
import hello.temp.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member memberA = new Member(1L, "memberA", Grade.VIP);

        memberService.join(memberA);

    }
}
