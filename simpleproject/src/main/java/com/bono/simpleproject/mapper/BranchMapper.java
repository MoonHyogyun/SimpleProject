package com.bono.simpleproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bono.simpleproject.vo.Branch;

@Mapper
public interface BranchMapper {
	//branch 정보 전체 가져오기
	List<Branch> selectBranch();
	
	//branchCode에 따라 branchName 정보 가져오기
	Branch selectBranchOne(int branchCode);
	
}
