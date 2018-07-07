package com.zlpay.provder.service;

import com.zlpay.common.feign.dto.PayDTO;
import com.zlpay.common.feign.dto.PayResultDTO;

public interface ProviderService {
	
	/**
	* @Description: 支付  
	* @param dto
	* @return PayResultDTO
	* @throws  
	* @author: syuf
	* @date: 2018年6月28日 上午11:51:14
	 */
	PayResultDTO pay(PayDTO dto);

	/**
	* @Description: 退款  
	* @param orderId
	* @return String
	* @throws  
	* @author: syuf
	* @date: 2018年6月28日 上午11:51:25
	 */
	String refund(String orderId);
	
}
