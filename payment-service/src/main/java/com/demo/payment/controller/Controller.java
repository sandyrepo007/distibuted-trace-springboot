package com.demo.payment.controller;

import com.demo.payment.client.CreditClient;
import com.demo.payment.client.model.CreditInfo;
import com.demo.payment.model.PaymentInfo;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
@Slf4j
public class Controller {
    private Random random = new Random();
    private static final Logger log = LoggerFactory.getLogger(Controller.class);
    @Autowired
    CreditClient creditClient;

    @GetMapping("/paymentInfo/accounts/{id}")
    public PaymentInfo getPaymentInfoByAccountId(@PathVariable long id) {
        log.info("Handling getPaymentInfoByAccountId: id={}", id);

        // use delay to pretend processing is happening
        randomDelay();

        final CreditInfo creditInfo = creditClient.getCreditInfo(id);

        // use delay to pretend processing is happening
        randomDelay();

        return new PaymentInfo(id, new Date(), creditInfo);
    }

    private void randomDelay() {
        try {
            // sleep a bit
            Thread.sleep((long)(2*random.nextDouble()*1000));
        } catch (Exception e) {
            // ignore
        }
    }
}
