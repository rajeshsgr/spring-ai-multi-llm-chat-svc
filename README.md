
## **Overview**

This Spring Boot application demonstrates how to use **Spring AI** to build a chat application that integrates with multiple AI models. The application provides two REST endpoints for interacting with:

OpenAI chat models.
Ollama chat models (for locally hosted AI).

It leverages the Spring AI ChatClient to abstract API interactions, ensuring clean and maintainable code.

## **Features**
- Chat with OpenAI GPT models.
- Chat with locally hosted Ollama models.
- Unified architecture using Spring AI’s `ChatClient`.
- Dependency injection for flexibility and modularity.

## **Prerequisites**
1. **Java**: JDK 17+
2. **Spring Boot**: 3.0+
3. **API Keys**:
   - OpenAI: A valid API key from OpenAI.
   - Ollama: Ensure Ollama is set up locally and accessible.

## **Build the Application**
` ./mvnw clean install `

## **Run the Application**
` ./mvnw spring-boot:run ` 
