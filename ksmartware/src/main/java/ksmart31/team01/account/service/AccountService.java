package ksmart31.team01.account.service;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.account.mapper.AccountMapper;
import ksmart31.team01.domain.Account;
import ksmart31.team01.domain.Member;


@Service
@Transactional
public class AccountService {
	@Autowired
	private AccountMapper accountMapper;
	//Account리스트
	public List<Account> getAccountList(){
		List<Account> accountList = accountMapper.selectAccountList();
		System.out.println(accountList + "AccountService getAccountList accountList");			
		return accountList;
	}
	//account 입력
	public int addAccount(Account account){
		return accountMapper.insertAccount(account);
	}
}
