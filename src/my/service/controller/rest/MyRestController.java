package my.service.controller.rest;

import my.service.data.RestData;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyRestController {

	@ResponseBody
	@RequestMapping(value="/restservice", method = RequestMethod.GET)
	public RestData getData() {
		RestData d = new RestData();
		d.setAge("3321");
		d.setName("hello");
		return d;
	}
}
