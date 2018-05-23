package com.prismit.consumingservices.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prismit.consumingservices.businessImpl.UserBusinessImpl;
import com.prismit.consumingservices.dto.User;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/insertpage")
	public String insertPage(Model model) {
		User user = new User();
		model.addAttribute("insert", user);
		return "insertpage";
	}

	@RequestMapping("/userslist")
	public String usersList(Model model) {
		UserBusinessImpl impl = new UserBusinessImpl();
		System.out.println("users List");
		User[] user = impl.getUserList();
		model.addAttribute("usersList", user);
		return "userslist";
	}
	
	@RequestMapping("/findUserById")
	public String finduserbyid(HttpServletRequest request,Model model) {
		UserBusinessImpl impl = new UserBusinessImpl();
		User findById = impl.findById(Integer.parseInt(request.getParameter("id")));
		model.addAttribute("findid", findById);
		return "userslistbyid";
		
	}
	@RequestMapping("/userview")
	public String finduserbyidcontroller() {
		return "userview";
	}
}
