package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index() {
		return "<font size=48 color=red>Hello GDG Hyderabad V1</font>";
	}
	
}
