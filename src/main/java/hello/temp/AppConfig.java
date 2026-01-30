package hello.temp;

import hello.temp.member.MemberService;
import hello.temp.member.MemberServiceImpl;
import hello.temp.member.MemoryMemberRepositoryImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepositoryImpl());
    }
}
