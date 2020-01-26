package fi.demot.hellospring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

	@RequestMapping("/index")
	public String giveIndex() {

		return "This is the first page";
	}

	@RequestMapping("/contact")
	public String giveContact() {

		return "This is the contact page";
	}

}
