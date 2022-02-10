package spring.web.ch02.ex03;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
// command DI 수단은 setter 와 constructor 이다.
//@Setter
//@AllArgsConstructor 
public class User {
	private String name;
	private int age;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate regDate;
}
