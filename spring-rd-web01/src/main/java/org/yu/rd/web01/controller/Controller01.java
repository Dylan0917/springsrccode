package org.yu.rd.web01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yu.wenhua
 * @desc
 * @date 2021/1/12 18:31
 */
@Controller
@RequestMapping("/c01")
public class Controller01 {
	@RequestMapping("/m01")
	public String m01(){
		return "success";
	}

}
