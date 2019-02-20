package com.bono.simpleproject.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.bono.simpleproject.vo.Client;

@Mapper
public interface SimpleMapper {
	Client selectClient(int clientId);

}
