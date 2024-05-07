import service.NoteService;
import view.NoteView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoteService noteService = new NoteService();
        NoteView noteView = new NoteView();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Nota");
            System.out.println("2. Listar Notas");
            System.out.println("3. Remover Nota");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Título: ");
                    String title = scanner.nextLine();
                    System.out.print("Conteúdo: ");
                    String content = scanner.nextLine();
                    noteService.addNote(title, content);
                    noteView.displayMessage("Nota adicionada com sucesso!");
                    break;
                case 2:
                    noteView.displayNotes(noteService.getAllNotes());
                    break;
                case 3:
                    System.out.print("Índice da nota a ser removida: ");
                    int index = scanner.nextInt();
                    noteService.removeNote(index);
                    noteView.displayMessage("Nota removida com sucesso!");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
