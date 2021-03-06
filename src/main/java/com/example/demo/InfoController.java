package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
public class InfoController {

	@ApiOperation(value = "Info service", notes = "Info service", tags = {"Info service" })
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String getInfo() {
		return "inside controller ->Info service executing in 3scale API Management";
	}

}
