package com.zlpay.provder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.zlpay.common.feign.dto.PayDTO;
import com.zlpay.common.feign.dto.PayResultDTO;
import com.zlpay.provder.service.ProviderService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ProviderController {
	
	@Autowired
	private ProviderService citciService;

	@RequestMapping(value = "/provider/pay",method = RequestMethod.POST)
    public PayResultDTO pay(@RequestBody PayDTO dto) {
		log.info("[聚合退款]controller层收到请求,入参{}",JSON.toJSONString(dto));
        return citciService.pay(dto);
    }
	
	@RequestMapping(value = "/provider/refund",method = RequestMethod.POST)
    public String openAcct(@RequestParam(value = "orderId") String orderId) {
		log.info("[聚合退款]controller层收到请求,入参,orderId={}",orderId);
        return citciService.refund(orderId);
    }
	
}
