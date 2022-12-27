package com.spring.spa.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController	//@ResponseBody와 @Controller의 합
@RequestMapping("/board")
public class BoardController {

	//SELECT - GET  - WEBPAGE 에서 호출시 /board/select  로 호출 
	@GetMapping("/select")
	public ModelAndView select() {
		return new ModelAndView();
	}
	
	//DELETE - POST - WEBPAGE 에서 호출시 /board/delete  로 호출 
	@PostMapping("/delete")
	public ModelAndView delete()  {
		return new ModelAndView();
    }
	
	//DELETE - POST- WEBPAGE 에서 호출시 /board/insert  로 호출
	@PostMapping("/insert")
	public ModelAndView insert() {
		return new ModelAndView();
	}
	
	//DELETE - POST- WEBPAGE 에서 호출시 /board/update  로 호출
	@PostMapping("/update")
	public ModelAndView update() {
		return new ModelAndView();
	}
	
}




