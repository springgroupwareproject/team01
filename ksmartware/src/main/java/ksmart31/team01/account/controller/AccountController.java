package ksmart31.team01.account.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart31.team01.account.service.AccountService;
import ksmart31.team01.domain.Account;


@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	//account 리스트
	@GetMapping(value="/accountListView")
	public String getAccountList(Model model,@RequestParam(value="currentPage", required = false, defaultValue = "1")int currentPage){
		Map<String,Object> map = accountService.getAccountList(currentPage);
				
		model.addAttribute("accountList", map.get("accountList"));
		
		
		return "accounting/accountListView";
	}
	
	
}
