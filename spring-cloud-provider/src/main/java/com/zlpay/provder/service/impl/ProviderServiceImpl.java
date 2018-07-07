package com.zlpay.provder.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.zlpay.common.feign.dto.PayDTO;
import com.zlpay.common.feign.dto.PayResultDTO;
import com.zlpay.common.feign.enums.RespCodeEnum;
import com.zlpay.provder.service.ProviderService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("providerService")
public class ProviderServiceImpl implements ProviderService {

	@Override
	public PayResultDTO pay(PayDTO dto) {
		log.info("[中信银行聚合]支付接口,入参:{}",JSON.toJSONString(dto));
		PayResultDTO resultDto = new PayResultDTO();
		resultDto.setRespCode(RespCodeEnum.SUCCESS);
		resultDto.setRespMsg("支付成功了");
		return resultDto;
	}

	@Override
	public String refund(String orderId) {
		log.info("[中信银行聚合]退款接口,入参:{}",orderId);
		return "refund is ok";
	}

}
