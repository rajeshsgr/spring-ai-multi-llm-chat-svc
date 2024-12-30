package com.raj.nola.llm.chat.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OllamaChatController {

    final ChatClient chatClient;

    public OllamaChatController(@Qualifier("ollamaChatClient") ChatClient chatClient){
        this.chatClient=chatClient;
    }

    @GetMapping("/ollamaChat")
    public String chat() {
        return chatClient.prompt()
                .user("Tell me something about GenAI and Ollama")
                .call()
                .content();
    }

}
