
public class TaskManager {
    public void addTask(String type, String title, int priority) {
        Task task = TaskFactory.createTask(type, title, priority);
        task.displayTaskInfo();
    }

    public void listTasks() {
        System.out.println("Listing all tasks...");
    }
}
