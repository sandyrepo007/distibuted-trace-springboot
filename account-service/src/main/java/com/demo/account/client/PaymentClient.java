package com.demo.account.client;

import com.demo.account.client.model.PaymentInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "payment", url = "${client.payment.url}")
public interface PaymentClient {
    @GetMapping(value = "/paymentInfo/accounts/{accountId}", consumes = "application/json")
    PaymentInfo getPaymentInfo(@PathVariable long accountId);
}
