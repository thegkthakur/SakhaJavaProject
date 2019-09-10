package com.vruksha.restclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vruksha.restclient.RestClientAppApplication;
import com.vruksha.restclient.services.RestClientService;
import com.vruksha.restclient.trainee.Trainee;

@Controller
public class TraineeController {

	@Autowired
	RestClientService rst;
	
	@GetMapping("/")
	public String showHome()
	{
		return "home.jsp";
	}
	
	
	
	@GetMapping("/show")
	public String getTrainee(@RequestParam("id") int id, Model m)
	{
		Trainee t = rst.getTrainee(id);
		if(t!=null)
		{
		m.addAttribute("trainee",t);
		
		}
		else
		{
		m.addAttribute("trainee","No Trainee with this id...");
		}
		return "showtrainee.jsp";
	}
	
	@PostMapping("/add")
	public String addTrainee(@ModelAttribute Trainee trainee, Model m)
	{
	 rst.AddTrainee(trainee);
	 m.addAttribute("msg","Successfully Added");
	 return "success.jsp";
	 
	}
	@GetMapping("/publicmsg")
	public String publicMsg(Model m)
	{
		m.addAttribute("msg",rst.showPublicMsg());
		return "show.jsp";
	}
	
	@GetMapping("/securemsg")

	public String secureMsg(Model m)
	{
		m.addAttribute("msg",rst.showSecureMsg());
		return "abc.jsp";
	}
	
	
}
