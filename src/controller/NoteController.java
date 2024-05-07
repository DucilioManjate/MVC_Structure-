package controller;

import model.Note;
import view.NoteView;

import java.util.ArrayList;
import java.util.List;

public class NoteController {
    private List<Note> notes;
    private NoteView noteView;

    public NoteController(NoteView noteView) {
        this.notes = new ArrayList<>();
        this.noteView = noteView;
    }

    public void addNote(String title, String content) {
        Note note = new Note(title, content);
        notes.add(note);
        noteView.displayMessage("Nota adicionada com sucesso!");
    }

    public void listNotes() {
        noteView.displayNotes(notes);
    }

    public void removeNote(int index) {
        if (index >= 0 && index < notes.size()) {
            notes.remove(index);
            noteView.displayMessage("Nota removida com sucesso!");
        } else {
            noteView.displayMessage("Índice inválido!");
        }
    }
}
