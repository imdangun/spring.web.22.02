package spring.web.ch02.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/home")
public class NumController {
	@GetMapping("numIn")
	public String numIn() {
		return "";
	}
	
	@GetMapping("numOut")
	public String numOut() {
		return "";
	}
}

/*
과제: 
폼에 자연수 하나를 입력한다.
폼을 제출한다.
입력값 <= x < 입력값 + 1 인, x 를 출력한다.

x 는 실수이다.
x 는 랜덤값이다.
x 는 소수점 이하 한자리까지 표현한다.
*/
