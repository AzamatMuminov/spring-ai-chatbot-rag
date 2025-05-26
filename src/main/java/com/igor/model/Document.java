package com.igor.model;

import jakarta.persistence.*;
import java.util.Arrays;

import javax.print.Doc; 

@Entity
@Table(name = "documents")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @Column(columnDefinition = "vector(1536)")
    private float[] embedding;
    
    public Document() {}

    public Document(String  content,    float[] embedding){
        this.content = content;
        this.embedding = embedding;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }
    
    public String   getContent() {
        return content;
    }

    public float[] getEmbedding() {
        return embedding;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setEmbedding(float[] embedding) {
        this.embedding = embedding;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", embedding=" + Arrays.toString(embedding) +
                '}';
    }
}
