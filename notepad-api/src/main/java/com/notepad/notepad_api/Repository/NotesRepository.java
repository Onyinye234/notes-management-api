package com.notepad.notepad_api.Repository;

import com.notepad.notepad_api.Model.Entities.NotesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<NotesEntity, Long> {

}
