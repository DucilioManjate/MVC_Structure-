package view;



import model.Note;

import java.util.List;

public class NoteView {
    public void displayNotes(List<Note> notes) {
        System.out.println("===== Notas =====");
        for (Note note : notes) {
            System.out.println("Título: " + note.getTitle());
            System.out.println("Conteúdo: " + note.getContent());
            System.out.println("------------------");
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
