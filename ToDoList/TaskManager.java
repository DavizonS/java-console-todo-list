import java.util.*;
import java.io.*;

public class TaskManager {
    private List<Task> tasks;
    private final String filename = "tasks.txt";

    public TaskManager() {
        tasks = new ArrayList<>();
        loadTasks();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
        saveTasks();
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            saveTasks();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void markTaskCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
            saveTasks();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private void saveTasks() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Task task : tasks) {
                writer.println(task.toFileString());
            }
        } catch (IOException e) {
            System.out.println("Error guardando tareas: " + e.getMessage());
        }
    }

    private void loadTasks() {
        File file = new File(filename);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(Task.fromFileString(line));
            }
        } catch (IOException e) {
            System.out.println("Error cargando tareas: " + e.getMessage());
        }
    }
}
