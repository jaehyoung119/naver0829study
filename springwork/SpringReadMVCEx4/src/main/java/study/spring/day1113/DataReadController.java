package study.spring.day1113;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataReadController {
	
	@GetMapping("/process1")
	//@RequestParam("폼태그의 name") String 변수명: 폼태그의 name과 변수명이 같을경우 name 생략가능
	//@RequestParam 자체 생략 가능 다른어노테이션으로 인식하는 경우로 지양
	public String process1(Model model, @RequestParam("name") String irum, @RequestParam String addr, @RequestParam int age) {
		model.addAttribute("name",irum);
		model.addAttribute("addr", addr);
		model.addAttribute("age", age+"세는 "+(age>=20?"성인":"미성년자")+"입니다");
		return "result1";
	}
	
	/*public String process1(HttpServletRequest request,Model model) {
		
		//jsp 처럼 읽어보자
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		int age = Integer.parseInt(request.getParameter("age"));
		
		model.addAttribute("name", name);
		model.addAttribute("addr", addr);
		model.addAttribute("age", age+"세는 "+(age>=20?"성인":"미성년자")+"입니다");
		return "result1";
	} */
	
	@PostMapping("/process2")
	public String process2(Model model,@RequestParam String message,@RequestParam String knight,
			@RequestParam(defaultValue = "다니엘",required = false) String name/*null값인 경우 디폴드 다니엘*/ ) {
		System.out.println(name);
		model.addAttribute("name", name); //폼태그에 name 이라는 태그는 없음
		model.addAttribute("message",message);
		model.addAttribute("knight", knight);
		return "result2";
	}
	
	//@ModelAttribute : dto 와 같은 이름의 폼태그를 읽어서 모델에 저장한다(생략가능)
	@PostMapping("/process3")
	public String process3(@ModelAttribute ShopDto dto, @RequestParam String today, Model model)//model에 shopdto 저장 
	//public String procees3(@ModelAttribute("dto") ShopDto dto) //model 에 dto 라는 이름으로 저장
	{
		model.addAttribute("today", today);
		return "result3";
	}
	
	@PostMapping("/process4")
	public String process4(Model model, @RequestParam Map<String, String>map) //폼태그의 name이 key로, 입력값이 value로저장 
	{
		model.addAttribute("name", map.get("name"));
		model.addAttribute("rank", map.get("rank"));
		model.addAttribute("age", map.get("age"));
		model.addAttribute("color", map.get("color"));
		model.addAttribute("photo", map.get("photo"));
		model.addAttribute("today", map.get("today"));
		return "result4";
	}
}
