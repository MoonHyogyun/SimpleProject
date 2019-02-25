package com.bono.simpleproject.mapper;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Mapper;

import com.bono.simpleproject.vo.Account;

@Mapper
public interface AccountMapper {
	//계좌 개설
	int insertAccount(Account account);
	
	//고객 아이디에 따른 계좌번호 가져오기
	List<Account> selectAccountNumber(int sessionId);
}
