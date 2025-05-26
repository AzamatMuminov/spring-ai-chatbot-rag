package com.igor.service;

import com.igor.model.Document;
import com.igor.repository.DocumentRepository;
import org.springframework.ai.embedding.EmbeddingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    private final DocumentRepository documentRepository;
    private final EmbeddingClient embeddingClient;

    @Autowired
    public DocumentService(DocumentRepository documentRepository, EmbeddingClient embeddingClient) {
        this.documentRepository = documentRepository;
        this.embeddingClient = embeddingClient;
    }

    public Document saveDocument(String text) {
        List<Double> embedding = embeddingClient.embed(text);
        Document document = new Document();
        document.setContent(text);
        document.setEmbedding(embedding);
        return documentRepository.save(document);
    }

    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }
}

