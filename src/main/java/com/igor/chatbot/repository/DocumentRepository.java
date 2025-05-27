package com.igor.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.chatbot.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
}

