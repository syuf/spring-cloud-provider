package com.zlpay.provider.controoler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.zlpay.common.app.ProviderAppService;
import com.zlpay.common.feign.dto.PayDTO;
import com.zlpay.common.feign.dto.PayResultDTO;
import com.zlpay.provider.service.ProviderService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ProviderController implements ProviderAppService{
	
	@Autowired
	private ProviderService citciService;

	@Override
    public PayResultDTO pay(@RequestBody PayDTO dto) {
		log.info("[聚合支付]controller层收到请求,入参{}",JSON.toJSONString(dto));
        return citciService.pay(dto);
    }
	
	@Override
	public String refund(String orderId) {
		log.info("[聚合退款]controller层收到请求,入参,orderId={}",orderId);
        return citciService.refund(orderId);
	}
	
	@RequestMapping(value = "/openAcct",method = RequestMethod.POST)
    public String openAcct(@RequestParam(value = "orderId") String orderId) {
		log.info("[三类户]controller层收到请求,入参,orderId={}",orderId);
        return citciService.refund(orderId);
    }

	
	
}
