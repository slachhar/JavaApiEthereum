package com.Blockhain.Microservice.controller;

import com.Blockhain.Microservice.blockchain.SendTransaction;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("/interact")
public class InteractController {

    @PostMapping("/{value}")
    public void storeValue(@PathVariable Long value) throws Exception {
//        SendTransaction st = new SendTransaction();
        SendTransaction.storeValue(value);
    }
}
