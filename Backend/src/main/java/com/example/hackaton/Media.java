package com.example.hackaton;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity(name = "media")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Media {

  @jakarta.persistence.Id
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", updatable = false)
  private Long id;

  @CreatedDate
  @Column(name = "created_at", nullable = false)
  private LocalDateTime createdAt;

  @Column(name = "title", nullable = false)
  private String title;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "category", nullable = false)
  private String category;

  @Column(name = "body", nullable = false)
  private String body;

  @Column(name = "author_name", nullable = false)
  private String authorName;

  @Column(name = "is_accepted", nullable = false)
  private Boolean isAccepted;

  public Media() {}

  public Media(
      String title,
      String category,
      String body,
      String authorName,
      Boolean isAccepted,
      String email) {
    this.title = title;
    this.category = category;
    this.body = body;
    this.authorName = authorName;
    this.isAccepted = isAccepted;
    this.email = email;
  }
}
