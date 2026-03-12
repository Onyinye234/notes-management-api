package com.notepad.notepad_api.Model.Dto;
import lombok.*;
@Setter
@Getter
@AllArgsConstructor
public class NotesResponseDto {
    private Long id;
    private String title;
    private String content;


}
