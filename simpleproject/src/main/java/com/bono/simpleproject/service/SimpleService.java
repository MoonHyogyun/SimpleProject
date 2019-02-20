package com.bono.simpleproject.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bono.simpleproject.mapper.SimpleMapper;
import com.bono.simpleproject.vo.Client;

@Service
public class SimpleService {
	
	@Autowired
	private SimpleMapper simpleMapper;
	
	//아이디 패스워드 가져오기
	public String loginClient(HttpSession session, int clientId, String clientPw) {
		System.out.println("로그인");
		
		Client client = simpleMapper.selectClient(clientId);
		
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
}
