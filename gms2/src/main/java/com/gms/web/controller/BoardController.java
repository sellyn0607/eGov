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

import com.gms.web.domain.ArticleDTO;
import com.gms.web.domain.MemberDTO;
import com.gms.web.service.BoardService;
import com.gms.web.service.MemberService;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired ArticleDTO articleDTO;
	@Autowired BoardService boardService;
	@RequestMapping(value="/add/{dir}/{page}",method=RequestMethod.POST)
	public String add(
			@PathVariable String dir,
			@PathVariable String page) {
		
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
	public String modify(Model model,@PathVariable String dir,
			@PathVariable String page) {
		return "login:"+dir+"/"+page+".tiles";
	}
	@RequestMapping("/remove")
	public String remove() {
		
		return "redirect:/";
	}
	
	@RequestMapping("/login/{dir}/{page}")
	public String login(){
		
				return "";
		
	}
	@RequestMapping("/logout")
	public String logout() {
			
		return "redirect:/";
	}
	
	@RequestMapping("/fileupload")
	public void fileupload() {
		
	}
	
}
