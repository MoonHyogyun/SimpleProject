package com.bono.simpleproject.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.bono.simpleproject.vo.Branch;
import com.bono.simpleproject.vo.Client;

@Mapper
public interface ClientMapper {
	//고객id에 따른 고객정보 가져오기
	Client selectClient(int clientId);
	
	//
	Branch selectBranch();
}
