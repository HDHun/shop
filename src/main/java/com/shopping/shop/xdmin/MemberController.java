package com.shopping.shop.xdmin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberServiceImpl service;
	
	@RequestMapping(value = "/code/codeGroupList")
	public String codeGroupList(@ModelAttribute("vo") MemberVo vo, Model model) throws Exception {
		int count = service.selectOneCount(vo);
		vo.setParamsPaging(count);
		if(count !=0) {
		List<Member> list = service.selectList(vo);
		model.addAttribute("list", list);}
		else {
			/* @modelAttribute("vo") = model.attribute("vo",vo) */
		}
		return "code/codeGroupList";}
	
	  @RequestMapping(value = "/code/codeGroupForm") 
	  public String codeGroupForm() throws Exception {
		  return "code/codeGroupForm"; }

	
	 
	
	@RequestMapping(value = "/code/codeGroupInst")
	public String codeGroupInst(Member dto) throws Exception {
		service.insert(dto);
		return "";}
	
	@RequestMapping(value = "/code/codeGroupView")
	public String codeGroupView(MemberVo vo, Model model) throws Exception {
	// 디비까지 가서 한 건의 데이터를 가져온다.
	Member item = service.selectOne(vo);
	model.addAttribute("item", item);
	return "code/codeGroupView";	}

	
	@RequestMapping(value = "/code/codeGroupForm2") public String
	codeGroupForm2(MemberVo vo, Model model) throws Exception {
	Member item = service.selectOne(vo);
	model.addAttribute("item", item); 
	return "code/codeGroupForm2"; }
	  
	  
	
	  @RequestMapping(value = "/code/codeGroupUpdt") public String
	  codeGroupUpdt(Member dto) throws Exception 
	  {service.update(dto); return ""; }

	  @RequestMapping(value = "/code/codeForm") 
	  public String codeForm(MemberVo vo,Model model) throws Exception {  
		List<Member> list = service.selectListCode(vo);
		model.addAttribute("list",list);
		return "code/codeForm";}
	  
	  @RequestMapping(value = "/code/codeForm2") public String codeForm2(MemberVo vo,
			  Model model) throws Exception {
		  
		  Member item = service.selectOneCode(vo);
		  
		  model.addAttribute("item", item);
		  
		  return "code/codeForm2"; }
	  
	  @RequestMapping(value = "/code/codeList")
		public String codeList(@ModelAttribute("vo") MemberVo vo, Model model) throws Exception {
			int codeCount = service.selectOneCodeCount(vo);
					vo.setParamsPaging(codeCount);
			if(codeCount !=0) {
			List<Member> list = service.selectListCode(vo);
			model.addAttribute("list", list);}
			else {
				/* @modelAttribute("vo") = model.attribute("vo",vo) */
			}
			return "code/codeList";}
		
		@RequestMapping(value = "/code/codeInst")
		public String codeInst(Member dto) throws Exception {
			
			// 입력이 되어야 함
			service.insertCode(dto);
			
			return "redirect:/code/codeList";
		}
		@RequestMapping(value = "/code/codeView")
		public String codeView(MemberVo vo, Model model) throws Exception {
			
			System.out.println("vo.getIfcdSeq(): " + vo.getIfcdSeq());
			
			// 디비까지 가서 한 건의 데이터를 가져온다.
			Member item = service.selectOneCode(vo);
			
			// jsp로 데이터를 넘겨준다
			model.addAttribute("item", item);
			
			return "code/codeView";
		}
		
	  @RequestMapping(value = "/code/codeUpdt") public String
	  codeUpdt(Member dto) throws Exception {
		  
		  service.updateCode(dto); return "redirect:/code/codeView?ifcdSeq=" +dto.getIfcdSeq(); }
	  
	 
}