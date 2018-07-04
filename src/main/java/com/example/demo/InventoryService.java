package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.InventoryVo;

@RestController
public class InventoryService {

	private Logger logger = LoggerFactory.getLogger(DemoServiceInventoryApplication.class);

	@RequestMapping(value = "/getInventory")
	public InventoryVo getInventory(@RequestParam(value = "sku") String sku) {
		logger.info("### InventoryService.getInventory called");
		
		// do something
		InventoryVo vo = new InventoryVo();
		vo.setSku(sku);
		vo.setQty(100);
		return vo;
	}
	
}
