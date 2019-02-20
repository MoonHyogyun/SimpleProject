package com.bono.simpleproject.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.bono.simpleproject.vo.Branch;
import com.bono.simpleproject.vo.Client;

@Mapper
public interface OrderMapper {
	
	Branch selectBranch();
}
