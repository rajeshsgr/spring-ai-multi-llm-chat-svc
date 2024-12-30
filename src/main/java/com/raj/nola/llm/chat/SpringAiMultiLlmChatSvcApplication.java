package com.raj.nola.llm.chat;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ai.openai.OpenAiChatModel;

@SpringBootApplication
public class SpringAiMultiLlmChatSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAiMultiLlmChatSvcApplication.class, args);
    }

    @Bean
    public ChatClient openAIChatClient(OpenAiChatModel chatModel) {
        return ChatClient.create(chatModel);
    }

    @Bean
    public ChatClient ollamaChatClient(OllamaChatModel chatModel) {
        return ChatClient.create(chatModel);
    }

}
