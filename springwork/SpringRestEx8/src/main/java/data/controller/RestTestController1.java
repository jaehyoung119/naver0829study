package data.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import data.dto.MemoDto2;

@Controller
public class RestTestController1 {
	
	@GetMapping("/test/list1")
	@ResponseBody public List<MemoDto2> list1() {
		List<MemoDto2> list = new Vector<MemoDto2>();
		list.add(new MemoDto2(1, "종려", "최애기사1.jpg","이쁘다",5,"2023-10-10"));
		list.add(new MemoDto2(1, "카구라", "최애기사2.jpg","이쁘다",2,"2023-10-10"));
		list.add(new MemoDto2(1, "신학", "최애기사3.jpg","이쁘다",4,"2023-10-10"));
		return list;
	}
	
	@GetMapping("/test/add")
	@ResponseBody public MemoDto2 add(String nickname, String photo, String memo) {
		MemoDto2 dto = new MemoDto2(1, nickname, photo, memo, 10,"2022-02-02");
		return dto;
	}
	
	@PostMapping("/test/list2")
	public Map<String, String> test() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name","손흥민");
		map.put("age","31");
		return map;
	}
}
 