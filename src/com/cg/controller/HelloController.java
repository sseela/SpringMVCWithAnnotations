package com.cg.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	/*@RequestMapping(value="/sample")
	public String sampleMethod(Model model) throws Exception{ 	
		model.addAttribute("student", new Student());
		return "success";
	}
	
	@RequestMapping(value="/postSample", method=RequestMethod.POST)
	public String postSample() throws Exception{
		return "success";
	}
	
	@ModelAttribute("ownMsg")
	public String own(Model model) throws Exception{
		model.addAttribute("student", new Student());
		return "fuck";
	}
	
	@RequestMapping(value="/modelAttribute")
	public ModelAndView modelAttribute() throws Exception{
		ModelAndView mav = new ModelAndView("success");
		mav.addObject("message", "this is the message set normally");
		return mav;
	}
	
	@RequestMapping(value="/")
	public String displayStudentForm(Model model) throws Exception{
		model.addAttribute("student", new Student());
		return "index";
	}
	
	@RequestMapping(value="/student")
	public ModelAndView saveStudent(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model) throws Exception{
		model.addAttribute("student", new Student());
		if(result.hasErrors()) {
			ModelAndView mav = new ModelAndView("index");
			return mav;
		}
		
		
		return new ModelAndView("success");
	}*/
	
	@ModelAttribute("student")
	public Student displayForm() throws Exception{
		return new Student();
	}
	
	@RequestMapping(value="/SpringMVCWithAnnotations/getStudent", method=RequestMethod.GET)
	public String second() throws Exception{
		
		return "second";
	}
	
	@RequestMapping(value="/postStudent", method=RequestMethod.POST)
	public String displayStudentForm(@ModelAttribute("student") Student stud, Model model) throws Exception{
		model.addAttribute("message", "fine");
		return "success";
	}
}
