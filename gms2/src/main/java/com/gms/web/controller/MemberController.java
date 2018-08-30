package com.gms.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.support.RequestPartServletServerHttpRequest;

import com.gms.web.domain.MemberDTO;
import com.gms.web.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired MemberDTO member;
	@Autowired MemberService memberService;
	@RequestMapping(value="/add/{dir}/{page}",method=RequestMethod.POST)
	public String add(@ModelAttribute("member") MemberDTO member,
			@PathVariable String dir,
			@PathVariable String page) {
		
		memberService.add(member);
		return "public:"+dir+"/"+page+".tiles";
	}
	@RequestMapping("/list")
	public void list() {
		
	}
	@RequestMapping("/search")
	public void search() {
		
	}
	@RequestMapping("/retrieve")
	public void retrieve() {
		
	}
	@RequestMapping("/count")
	public void count() {
		
	}
	@RequestMapping("/modify/{dir}/{page}")
	public String modify(@ModelAttribute("member") MemberDTO member,Model model,@PathVariable String dir,
			@PathVariable String page) {
		memberService.modify(member);
		model.addAttribute("user", memberService.retrieve(member.getUserid()));
		return "login:"+dir+"/"+page+".tiles";
	}
	@RequestMapping("/remove")
	public String remove(@ModelAttribute("member") MemberDTO member) {
		memberService.remove(member);
		
		return "redirect:/";
	}
	
	@RequestMapping("/login/{dir}/{page}")
	public String login(@PathVariable String dir,
			@PathVariable String page,Model model,
			@ModelAttribute("member") MemberDTO member,HttpSession session) {
			String result="";
			if(memberService.login(member)) {
				//model.addAttribute("user", memberService.retrieve(member.getUserid()));
				session.setAttribute("user", memberService.retrieve(member.getUserid()));
				result ="login:"+dir+"/"+page+".tiles";
				
			}else {
				result ="public:member/login.tiles";
			}
			
				return result;
		
	}
	@RequestMapping("/logout")
	public String logout() {
			
		return "redirect:/";
	}
	
	@RequestMapping("/fileupload")
	public void fileupload() {
		
	}
	
}
