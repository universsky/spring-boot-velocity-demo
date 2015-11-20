package com.boot.velocity.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.collect.Lists;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello(Model model) {
		List<String> list = Lists.newArrayList();
		list.add("哈喽，hadoop");
		list.add("哈喽，hbase");
		list.add("哈喽，hive");
		list.add("哈喽，pig");
		list.add("哈喽，zookeeper");
		// 将数据存放map里面，可以直接在velocity页面，使用key访问
		model.addAttribute("data", list);

		return new ModelAndView("/hello");
	}

}
