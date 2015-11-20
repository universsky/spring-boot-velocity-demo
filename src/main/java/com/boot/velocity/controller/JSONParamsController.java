/**
 * 
 */
package com.boot.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.boot.json.JSONObject;
import com.boot.json.JSONTool;

/**
 * @author 财宝
 *
 */
@Controller
public class JSONParamsController {
	@RequestMapping(name = "/api", method = RequestMethod.GET)
	public ModelAndView api(Model model) {
		return new ModelAndView("/api");
	}

	@RequestMapping(name = "/doApi", method = RequestMethod.POST)
	public ModelAndView doApi(Model model, @RequestParam(value = "api") String api) {
		Class<?> paramPojo = null;
		try {
			paramPojo = Class.forName(api);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			JSONObject JSONObject = JSONTool.toJSON(paramPojo.newInstance());
			model.addAttribute("jsonText", JSONObject);
			System.out.println(JSONObject);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return new ModelAndView("/api");
	}

}
