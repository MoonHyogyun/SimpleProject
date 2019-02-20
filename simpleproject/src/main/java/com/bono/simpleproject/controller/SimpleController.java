package com.bono.simpleproject.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bono.simpleproject.service.SimpleService;
import com.bono.simpleproject.vo.Branch;

@Controller
public class SimpleController {

	@Autowired
	private SimpleService simpleService;
	
	// 1. 로그인폼
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	// 2.로그인 처리
	@PostMapping("/login")
	public String login(HttpSession session, @RequestParam("clientId") int clientId, @RequestParam("clientPw") String clientPw) {
		System.out.println("로그인 처리 요청");
		return simpleService.loginClient(session, clientId, clientPw);
	}
	// 3. index폼
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	// 4. 로그아웃
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "index";
		
	}
	
	// 5. 계좌개설폼
	@GetMapping("/openAccount")
	public String openAccount(Model model) {
		List<Branch> branchList = simpleService.getBranchList();
		model.addAttribute("branchList", branchList);
		return "openAccount";
	}
	
	// 6. 계좌개설처리
	@PostMapping("/openAccount")
	public String openAccountAction(Account account) {	//매개변수 확인 필요(구현중)
		
		return "index";
	}
	
}
