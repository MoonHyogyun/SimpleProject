package com.bono.simpleproject.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.bono.simpleproject.vo.Account;

@Mapper
public interface AccountMapper {
	//계좌 개설
	int insertAccount(Account account);
	
}
