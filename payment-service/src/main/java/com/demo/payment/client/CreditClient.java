package com.demo.payment.client;

import com.demo.payment.client.model.CreditInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "credit", url = "${client.credit.url}")
public interface CreditClient {
    @GetMapping(value = "/creditInfo/accounts/{accountId}", consumes = "application/json")
    CreditInfo getCreditInfo(@PathVariable long accountId);
}
