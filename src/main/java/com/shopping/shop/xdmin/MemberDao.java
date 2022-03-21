package com.shopping.shop.xdmin;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	
	@Inject
//	@Resource(name = "sqlSession")
//	codeGroup
	private SqlSession sqlSession;
	
	private static String namespace = "com.shopping.shop.xdmin.MemberMpp";

	public List<Member> selectList(MemberVo vo) { List<Member> list = sqlSession.selectList(namespace + ".selectList",vo); return list;} 
	
	public int insert(Member dto) {return sqlSession.insert(namespace + ".insert", dto);}
		 
	public Member selectOne(MemberVo vo) { return sqlSession.selectOne(namespace + ".selectOne", vo);}

	public int selectOneCount(MemberVo vo) { return sqlSession.selectOne(namespace + ".selectOneCount", vo);}
	
	public int update(Member dto) {return sqlSession.update(namespace + ".update", dto);}

	//	code
	
	public List<Member> selectListCode(MemberVo vo) { List<Member> list = sqlSession.selectList(namespace + ".selectListCode",vo); return list;}
	
	public int insertCode(Member dto) {return sqlSession.insert(namespace + ".insertCode", dto);}
	
	public Member selectOneCode(MemberVo vo) { return sqlSession.selectOne(namespace + ".selectOneCode", vo);}
	
	public int updateCode(Member dto) {return sqlSession.update(namespace + ".updateCode", dto);}
	
	public int selectOneCodeCount(MemberVo vo) { return sqlSession.selectOne(namespace + ".selectOneCodeCount", vo);}
	
	
	
	
}