package kr.co.softsoldesk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean;


@Controller
public class TestController {
	
	@GetMapping("/input_data")
	public String input_data(DataBean dataBean) {
		
		return "input_data";
	}
	
	
	
	@PostMapping("/input_pro")
	public String input_pro(@Valid DataBean dataBean, BindingResult result) {
		
		if(result.hasErrors()) {
			return "input_data";
			
		}
		return "input_success";
	}
	
}