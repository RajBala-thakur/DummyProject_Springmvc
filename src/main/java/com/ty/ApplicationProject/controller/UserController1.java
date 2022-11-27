package com.ty.ApplicationProject.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.ApplicationProject.dto.Application;
import com.ty.ApplicationProject.dto.User;
import com.ty.ApplicationProject.service.UserService1;

@Controller
public class UserController1 {

	@Autowired
	UserService1 userservice;

	@RequestMapping("login")
	public ModelAndView log(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", new User());
		modelAndView.setViewName("login.jsp");

		return modelAndView;
	}

	User u;

	@RequestMapping("saveapp")
	public ModelAndView saveap(@ModelAttribute User user, Application application, HttpServletRequest req,
			HttpServletResponse res) {
		u = userservice.findEmail(user.getEmail());
		ModelAndView modelAndView = new ModelAndView();

		if (u.getPassword().equals(user.getPassword())) {
			modelAndView.addObject("application", new Application());
			modelAndView.setViewName("view.jsp");
		} else {
			modelAndView.setViewName("login.jsp");
		}
		return modelAndView;
	}

	@RequestMapping("signup")
	public ModelAndView sinup(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", new User());
		modelAndView.setViewName("Signup.jsp");
		return modelAndView;
	}

	@RequestMapping("saveuser")
	public ModelAndView save(@ModelAttribute User user) {
		userservice.saveUser(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", new User());
		modelAndView.setViewName("index.jsp");
		return modelAndView;
	}

	@RequestMapping("exit")
	public ModelAndView sendlist(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("login");
		return modelAndView;

	}

	@RequestMapping("createapp")
	public ModelAndView add(@ModelAttribute Application application) {
		application.setApp_name(null);
		;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("application", new Application());

		userservice.saveApp(application);
		modelAndView.setViewName("view.jsp");

		return modelAndView;

	}

//	@RequestMapping("delete")
//	public void removeApplication(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		userservice.removeApplicaton(Integer.parseInt(request.getParameter("id")));
//		RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	@RequestMapping("edit")
//	public ModelAndView editStudent(@RequestParam int id) {
//		Application application = userservice.getApplicatonByid(id);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("application", application);
//		modelAndView.setViewName("edit.jsp");
//		return modelAndView;
//
//	}
}
