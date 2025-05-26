# AI Chatbot with Spring Boot

This is an AI-powered chatbot application built using Spring Boot, PostgreSQL, and RAG (Retrieval-Augmented Generation) with LLM integration. The project is designed to demonstrate the architecture and engineering behind production-ready AI applications.

## Features

- Spring Boot backend
- REST API for chat communication
- PostgreSQL database (or ChromaDB for vector store)
- Future integration with Ollama for local LLMs
- RAG architecture for intelligent retrieval and response

## Getting Started

To run locally:

```bash
./mvnw spring-boot:run
```
Send test request:

```bash
curl -X POST http://localhost:8080/api/chat \
  -H "Content-Type: application/json" \
  -d '{"message": "Hello"}'
```

## Project Setup (In Progress)

This project is a local RAG chatbot using Spring Boot, PostgreSQL (with pgvector), and Ollama.

### ✅ Features so far:
- Spring Boot base project
- PostgreSQL + pgvector setup
- Local embeddings via Ollama (`nomic-embed-text`)
- Entity, Repository, Converter for `documents`

### 🔧 Requirements
- Java 17+
- PostgreSQL with pgvector
- Ollama installed and running locally
