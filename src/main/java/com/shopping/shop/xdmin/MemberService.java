package com.shopping.shop.xdmin;

import java.util.List;

public interface MemberService {
	//codegroup
	List<Member> selectList(MemberVo vo) throws Exception;
	int insert(Member dto) throws Exception;
	int update(Member dto) throws Exception; 
	Member selectOne(MemberVo vo) throws Exception;
	int selectOneCount(MemberVo vo) throws Exception;

	
	// code
	List<Member> selectListCode(MemberVo vo) throws Exception;
	int insertCode(Member dto) throws Exception;
	int updateCode(Member dto) throws Exception; 
	Member selectOneCode(MemberVo vo) throws Exception;
	int selectOneCodeCount(MemberVo vo) throws Exception;
}