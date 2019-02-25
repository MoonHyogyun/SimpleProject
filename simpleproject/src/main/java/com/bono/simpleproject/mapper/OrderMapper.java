package com.bono.simpleproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bono.simpleproject.vo.ItemOrder;

@Mapper
public interface OrderMapper {
	//ItemOrder에 값을 담아 DB에 입력
	int insertOrder(ItemOrder itemOrder);
	
	//세션에 있는 id에 따라 주문리스트를 출력
	List<ItemOrder> selectOrder(int sessionId);
}
