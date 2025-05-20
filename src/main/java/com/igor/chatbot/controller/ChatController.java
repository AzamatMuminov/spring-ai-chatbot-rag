package com.igor.chatbot.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class ChatController {

    @PostMapping("/chat")
    public Map<String, String> chat(@RequestBody Map<String,String> request){
        String message = request.get("message");
        String response = "Simulated AI Response for: " + message;

        Map<String, String> responseBody = new HashMap<>();
        responseBody.put("response", response);
        return responseBody;
    }
    
}
