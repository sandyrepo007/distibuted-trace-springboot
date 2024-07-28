package com.demo.account.controller;

import com.demo.account.client.PaymentClient;
import com.demo.account.client.ProfileClient;
import com.demo.account.client.model.PaymentInfo;
import com.demo.account.client.model.ProfileInfo;
import com.demo.account.model.AccountInfo;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Random;

@RestController
@Slf4j
public class Controller {
    private Random random = new Random();

    @Autowired
    PaymentClient paymentClient;

    @Autowired
    ProfileClient profileClient;
    
    private static final Logger log = LoggerFactory.getLogger(Controller.class);


    @GetMapping("/accounts/{id}")
    public AccountInfo getAccountInfo(@PathVariable long id) {
        log.info("Handling getAccountInfo, id={}", id);

        // use delay to pretend processing is happening
        randomDelay();

        final PaymentInfo paymentInfo = paymentClient.getPaymentInfo(id);

        // use delay to pretend processing is happening
        randomDelay();

        final ProfileInfo profileInfo = profileClient.getProfileInfo(id);

        // use delay to pretend processing is happening
        randomDelay();

        final AccountInfo accountInfo = new AccountInfo();
        accountInfo.setPaymentInfo(paymentInfo);
        accountInfo.setProfileInfo(profileInfo);

        return accountInfo;
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
