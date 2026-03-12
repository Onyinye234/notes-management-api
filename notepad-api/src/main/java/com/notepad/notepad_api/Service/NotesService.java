package com.notepad.notepad_api.Service;

import com.notepad.notepad_api.Model.Dto.NotesRequestDto;
import com.notepad.notepad_api.Model.Dto.NotesResponseDto;
import com.notepad.notepad_api.Model.Entities.NotesEntity;
import com.notepad.notepad_api.Repository.NotesRepository;
import org.springframework.stereotype.Service;

@Service
public class NotesService {
    NotesRepository notesRepository;

    public NotesService(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    public NotesResponseDto createNotesResponse(NotesEntity notesEntity) {
        return new NotesResponseDto(notesEntity.getId(), notesEntity.getTitle(), notesEntity.getContent());
    }

    public NotesResponseDto createNote(NotesRequestDto noteRequest) {
        NotesEntity newNotesEntity = notesRepository.save(new NotesEntity(noteRequest.getTitle(), noteRequest.getContent()));
        return createNotesResponse(newNotesEntity);
    }

    public NotesResponseDto getNoteById(Long id ){
        NotesEntity notesEntity = notesRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("note not found"));

        return createNotesResponse(notesEntity);
    }
}