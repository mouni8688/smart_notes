package com.smartnotes.smart_notes.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name="notes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Note {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id",nullable=false)
    private User user;

    @Column(nullable=false,length=255)
    private String title;

    @Column(nullable=false,columnDefinition="TEXT")
    private String summary;

    @Column(name="created_at",insertable=false,updatable=false)
    private LocalDateTime createdAt;

    @Column(name="updated_at",insertable=false,updatable=false)
    private LocalDateTime updatedAt;
}
