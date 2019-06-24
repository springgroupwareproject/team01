package ksmart31.team01.account.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.domain.Account;
import ksmart31.team01.domain.Member;


@Mapper
public interface AccountMapper {
	//account 리스트
	public List<Account> selectAccountList();
	//member_id 리스트
	public List<Member> selectMemberIdList();
	
	public int insertAccount(Account account);
	
}
