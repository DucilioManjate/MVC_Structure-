package service;

import model.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteService {
    private List<Note> notes;

    public NoteService() {
        this.notes = new ArrayList<>();
    }

    public void addNote(String title, String content) {
        Note note = new Note(title, content);
        notes.add(note);
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(notes); // Retorna uma cópia das notas para evitar modificação direta
    }

    public void removeNote(int index) {
        if (index >= 0 && index < notes.size()) {
            notes.remove(index);
        }
    }
}
