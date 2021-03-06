package ksmart31.team00.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberLoginService {
	
	@Autowired private MemberLoginMapper memberLoginMapper;
	
	// 로그인 처리를 위한 회원 정보 조회
	public Member getMemberForLogin(Member member){
		return memberLoginMapper.selectMemberForLogin(member);
	}
	
}