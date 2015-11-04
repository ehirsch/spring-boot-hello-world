package net.eikehirsch.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Eike Hirsch
 *         Date: 04.11.15
 *         Time: 13:05
 */
@Controller
public class HelloWorldController {

	@RequestMapping("*")
	@ResponseBody public String hello() {
		return "Hello World!";
	}
}
