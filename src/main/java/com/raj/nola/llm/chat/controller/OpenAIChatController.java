package com.raj.nola.llm.chat.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OpenAIChatController {

    private final ChatClient chatClient;

    public OpenAIChatController(@Qualifier("openAIChatClient")  ChatClient chatClient) {
        this.chatClient = chatClient;

    }

    @GetMapping("/openAIChat")
    public String chat() {
        return chatClient.prompt()
                .user("Tell me something about GenAI and OpenAI")
                .call()
                .content();
    }
}
