package me.enterman.serv.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerifyController {
	@PostMapping("/verify.php")
	public String verify(@RequestParam(name = "helloWorld",required = false,defaultValue = "null") String hashed){
		if(hashed.equals("null")){
			return null;
		}
		// 这里写验证
		return "";

	}

}
