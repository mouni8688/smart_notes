package com.smartnotes.smart_notes.controller;

import com.smartnotes.smart_notes.entity.Note;
import com.smartnotes.smart_notes.service.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    public final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id) {
        return noteService.getById(id);
    }

    @GetMapping("/user/{userId}")
    public List<Note> getNotesByUser(@PathVariable Long userId) {
        return noteService.getByUserId(userId);
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteService.createNote(note);
    }

    @DeleteMapping("/{id}")
    public String deleteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
        return "Notes Deleted";
    }
}
