package com.shopping.shop.xdmin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	
	
	@Autowired
	MemberDao dao;
	
	@Override
	public int selectOneCodeCount(MemberVo vo) throws Exception {
		
		return dao.selectOneCount(vo);
	}

	@Override
	public int selectOneCount(MemberVo vo) throws Exception {
		return dao.selectOneCount(vo);
	}

	@Override
	public List<Member> selectListCode(MemberVo vo) throws Exception {
		
		return dao.selectListCode(vo);
	}

	@Override
	public int insertCode(Member dto) throws Exception {
		return dao.insertCode(dto);
	}

	@Override
	public int updateCode(Member dto) throws Exception {
		return dao.updateCode(dto);
	}

	@Override
	public Member selectOneCode(MemberVo vo) throws Exception {
		return dao.selectOneCode(vo);
	}



	@Override
	public List<Member> selectList(MemberVo vo) throws Exception {
		return dao.selectList(vo);
	}

	@Override
	public int insert(Member dto) throws Exception {
		return dao.insert(dto);
	}

	@Override
	public Member selectOne(MemberVo vo) throws Exception {
		return dao.selectOne(vo);
	}

	
	@Override public int update(Member dto) throws Exception { 
		return dao.update(dto); 
	}
	 
	 

	
	
	
	
	
	
	
}