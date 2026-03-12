package com.notepad.notepad_api.Controller;

import com.notepad.notepad_api.Model.Dto.NotesRequestDto;
import com.notepad.notepad_api.Model.Dto.NotesResponseDto;
import com.notepad.notepad_api.Service.NotesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notepad")
public class NotepadController {
    private NotesService notesService;

    public NotepadController(NotesService notesService){
        this.notesService = notesService;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public ResponseEntity<NotesResponseDto> createNote(@RequestBody NotesRequestDto notesRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(notesService.createNote(notesRequest));

    }
    @GetMapping("/note/{id}")
    public ResponseEntity<NotesResponseDto> getNoteById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.FOUND).body(notesService.getNoteById(id));
    }
}
