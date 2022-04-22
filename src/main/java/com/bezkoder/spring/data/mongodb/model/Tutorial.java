package com.bezkoder.spring.data.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lessons")
public class Tutorial {
  @Id
  private String id;

  private String title;
  private String[] question;

  public Tutorial() {

  }

  public Tutorial(String title, String [] question) {
    this.title = title;
    this.question = question;
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String [] getQuestion() {
    return question;
  }

  public void setQuestion(String [] question) {
    this.question = question;
  }

  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", title=" + title + ", desc=" + question + "]";
  }
}
