package com.conversion.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {

	@GetMapping(path = "/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retriveExchngeValu(@PathVariable String from,
			                                     @PathVariable String to);
	
}
