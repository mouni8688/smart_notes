package com.smartnotes.smart_notes.service;

import com.smartnotes.smart_notes.entity.Note;
import com.smartnotes.smart_notes.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    
    public final NoteRepository noteRepository;


public NoteService(NoteRepository noteRepository){
    this.noteRepository=noteRepository;
}

//creating notes
public Note createNote(Note notes){
    return noteRepository.save(notes);
}

  //  get all notes of an user
  public List<Note> getByUserId(Long user_id){
    return noteRepository.findByUserId(user_id);
  } 

  ////getallnotes
  public List<Note> getAllNotes(){
    return noteRepository.findAll();
  }

  //get not by id
  public Note getById(Long id){
    return noteRepository.findById(id)
        .orElseThrow(()->new RuntimeException("Notes not found"));
  }

  ///delete notes
  public void deleteNote(Long id){
    if(!noteRepository.existsById(id)){
        throw new RuntimeException("Note not found");
    }
    noteRepository.deleteById(id);
  }



}
