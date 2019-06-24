package ksmart31.team01.account.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.account.service.AccountService;
import ksmart31.team01.domain.Account;

@RestController
public class RestAccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping(value="/getAccount")
	public List<Account> getAccount(){
		List<Account> accountList = accountService.getAccountList();
		return accountList;
	}
	
	@PostMapping(value="/addAccount")
	public void addAccount(Account account){
		System.out.println("/addAccount 요청");
		System.out.println(account + "RestAccountController addAccount account");
		accountService.addAccount(account);
	}	
}
