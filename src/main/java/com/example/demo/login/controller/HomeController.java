package com.example.demo.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.login.domain.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userService;
	
	
	//ホーム画面のGet用メソッド
	@GetMapping("/home")
	public String getHome(Model model) {
		
		model.addAttribute("contents", "login/home::home_contents");
		
		return "login/homeLayout";
	}
	
	//ログアウト用メソッド
	@PostMapping("/logout")
	public String postLogout() {
		return "redirect:/login";
	}
}