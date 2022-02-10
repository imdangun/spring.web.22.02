package spring.web.ch02.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 과제: view 를 return 하는 handler 하나뿐인 controller 를, 다른 방법으로 구현하라.
@Controller("ch02.ex03")
@RequestMapping("ch02/ex03/user")
public class UserController {
	@GetMapping
	public String userIn() {
		return "ch02/ex03/userIn";
	}
	
	// 과제: userIn.jsp 를 수정해서, '최한석'이 브라우저에 출력되도록 하라.
	@PostMapping
	public String userOut(User user) {
		return "ch02/ex03/userOut";
	}
}
