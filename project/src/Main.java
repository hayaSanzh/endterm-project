public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        TaskSubject taskSubject = new TaskSubject();

        User user1 = new User("Alice");
        taskSubject.addObserver(user1);

        taskManager.addTask("simple", "Buy groceries", 0);
        taskSubject.completeTask();
    }
}
