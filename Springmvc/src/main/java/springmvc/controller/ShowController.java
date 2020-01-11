package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import springmvc.model.Product;

@Controller


public class ShowController {
	@PostMapping("/show")
	public String show(Model m,HttpServletRequest req) {
	//public String show(Model m,@ModelAttribute ) {
	//public Employee show(@ModelAttribute Employee emp) { 

		int ProductId=Integer.parseInt(req.getParameter("txtProductId"));
		
		String ProductName=req.getParameter("txtProductName");
		
		int ProductPrice=Integer.parseInt(req.getParameter("txtProductPrice"));
		
//		Employee emp=new Employee(empId,empName);
		//m.addAttribute("eName","Tej");
		
		m.addAttribute("ProductId",ProductId);
		m.addAttribute("ProductName",ProductName);
		m.addAttribute("ProductPrice",ProductPrice);
		return "show";
	}
	@GetMapping("/hello")
	public void hello(HttpServletResponse res) throws IOException{
		res.getWriter().println("Hello world");
	}

}
