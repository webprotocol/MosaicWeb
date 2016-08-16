package org.zerock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.domain.DeptVO;

@Controller
@RequestMapping("/dept")
public class DeptController {

	static Logger logger = LoggerFactory.getLogger(DeptController.class);
	
	@RequestMapping(value = "/register", method = RequestMethod.GET )
	public void registerGET() {
		logger.info("registerGET()...");
		
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST )
	public void registerPOST(DeptVO dept) {
		logger.info("registerPOST()...");
	}
}
