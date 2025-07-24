public class Task {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[✔] " : "[ ] ") + description;
    }

    // Método para guardar en archivo
    public String toFileString() {
        return description + ";" + completed;
    }

    // Método para cargar desde archivo
    public static Task fromFileString(String line) {
        String[] parts = line.split(";");
        Task task = new Task(parts[0]);
        if (parts.length > 1 && parts[1].equals("true")) {
            task.markCompleted();
        }
        return task;
    }
}
