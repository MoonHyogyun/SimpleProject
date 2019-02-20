package com.bono.simpleproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bono.simpleproject.vo.Branch;
import com.bono.simpleproject.vo.Client;

@Mapper
public interface BranchMapper {
	//branch 정보 전체 가져오기
	List<Branch> selectBranch();
}
