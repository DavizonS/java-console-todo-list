import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (option) {
                case 1:
                    System.out.print("Descripción de la tarea: ");
                    String desc = scanner.nextLine();
                    manager.addTask(desc);
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("Número de la tarea completada: ");
                    int compIndex = scanner.nextInt() - 1;
                    manager.markTaskCompleted(compIndex);
                    break;
                case 4:
                    System.out.print("Número de la tarea a eliminar: ");
                    int delIndex = scanner.nextInt() - 1;
                    manager.deleteTask(delIndex);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (option != 0);

        scanner.close();
    }
}
