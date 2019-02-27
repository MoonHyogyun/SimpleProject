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
import com.bono.simpleproject.vo.Account;
import com.bono.simpleproject.vo.Branch;
import com.bono.simpleproject.vo.ItemOrder;

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
	public String openAccountAction(Account account, @RequestParam("branchCode") int branchCode) {
		simpleService.openAccount(account, branchCode);
		return "index";
	}
	
	// 7. 상품선택화면(계좌번호 선택 포함)
	@GetMapping("/orderItem")
	public String orderItem(HttpSession session, Model model) {
		System.out.println("계좌번호 선택하고 상품 선택하는 화면");
		List<Account> accountList = simpleService.getAccountNumberList((int)session.getAttribute("sessionId"));
		model.addAttribute("accountList", accountList);
		return "orderItem";
	}
	
	// 8. 주문처리 요청
	@PostMapping("/addOrder")
	public String addOrder(ItemOrder itemOrder) {
		simpleService.addOrder(itemOrder);
		return "redirect:/orderList";
	}
	
	// 9. 주문 리스트 요청
	@GetMapping("/orderList")
	public String getOrderList(HttpSession session, Model model) {
		List<ItemOrder> itemOrderList = simpleService.getOrderList((int)session.getAttribute("sessionId"));
		model.addAttribute("itemOrderList", itemOrderList);
		return "orderList";
	}
	
}
