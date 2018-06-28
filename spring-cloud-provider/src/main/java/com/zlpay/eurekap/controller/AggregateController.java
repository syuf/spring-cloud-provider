package com.zlpay.eurekap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zlpay.common.feign.dto.PayDTO;
import com.zlpay.common.feign.dto.PayResultDTO;
import com.zlpay.eurekap.service.CiticService;

@RestController
public class AggregateController {
	
	@Autowired
	private CiticService citciService;

	@RequestMapping("/aggregate/pay")
    public PayResultDTO pay(@RequestParam PayDTO dto) {
        return citciService.pay(dto);
    }
	
	@RequestMapping("/aggregate/refund")
    public String openAcct(@RequestParam String orderId) {
        return citciService.refund(orderId);
    }
	
}
