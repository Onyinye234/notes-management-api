package com.notepad.notepad_api.Model.Dto;
import jakarta.persistence.PrePersist;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
public class NotesRequestDto {
    @NotNull(message = "Title cannot be blank")
    private String title;

    @Size(min = 5, message = "Content must contain at least 5 characters")
    private String content;





}
