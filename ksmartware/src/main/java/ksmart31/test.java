package ksmart31;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class test {
	
	@GetMapping("/test")
	public String test2(){
	
		return "test";
	}
}

						
						