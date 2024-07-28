package com.demo.account.client;

import com.demo.account.client.model.ProfileInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "profile", url = "${client.profile.url}")
public interface ProfileClient {
    @GetMapping(value = "/profileInfo/accounts/{accountId}", consumes = "application/json")
    ProfileInfo getProfileInfo(@PathVariable long accountId);
}
