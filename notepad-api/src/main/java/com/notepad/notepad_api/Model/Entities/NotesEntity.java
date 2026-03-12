package com.notepad.notepad_api.Model.Entities;
import jakarta.persistence.*;
import lombok. *;
import java.time.LocalDateTime;
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "notes")
public class NotesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    public NotesEntity(String title, String content){
        this.title = title;
        this.content = content;

    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }





}

