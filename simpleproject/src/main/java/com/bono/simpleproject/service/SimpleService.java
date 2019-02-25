package com.bono.simpleproject.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.bono.simpleproject.mapper.AccountMapper;
import com.bono.simpleproject.mapper.BranchMapper;
import com.bono.simpleproject.mapper.ClientMapper;
import com.bono.simpleproject.mapper.OrderMapper;
import com.bono.simpleproject.vo.Account;
import com.bono.simpleproject.vo.Branch;
import com.bono.simpleproject.vo.Client;

@Service
public class SimpleService {
	
	@Autowired
	private AccountMapper accountMapper;
	@Autowired
	private ClientMapper clientMapper;
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private BranchMapper branchMapper;
	
	//아이디 패스워드 가져오기
	public String loginClient(HttpSession session, int clientId, String clientPw) {
		System.out.println("로그인");
		
		Client client = clientMapper.selectClient(clientId);
		
		if (clientId == client.getClientId() && clientPw.equals(client.getClientPw())) {
			// 로그인 성공 -> 로그인 정보 세션 등록
			session.setAttribute("sessionId", clientId);
			System.out.println(clientId);
			return "redirect:/index";
		} else {
			// 로그인 실패 -> 로그인 폼으로 리다이렉트
			return "redirect:/login";
		}
	}
	
	//관리점 리스트 가져오기
	public List<Branch> getBranchList() {
		List<Branch> branchList = (List<Branch>) branchMapper.selectBranch();
		return branchList;
		
	}
	
	//계좌개설
	public int openAccount(Account account,int branchCode) {
		//branchCode로 accountBranch 정보를 가져와 Account에 담기
		Branch branch = branchMapper.selectBranchOne(branchCode);
		account.setAccountBranch(branch.getBranchName());
		account.setAccountManager(branch.getBranchManager());
		
		System.out.println("openAccount = "+account);
		return accountMapper.insertAccount(account);

	}
	
	
}
