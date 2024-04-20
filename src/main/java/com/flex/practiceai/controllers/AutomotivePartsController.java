package com.flex.practiceai.controllers;

import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/automotive")
public class AutomotivePartsController {

    @Autowired
    private OpenAiChatClient chatClient;

    @GetMapping(value = "/infos")
    public String automotiveChat(@RequestParam(value = "message", defaultValue = "Quais peças um carro deve ter?") String message){
        return chatClient.call(message);
    }
}
