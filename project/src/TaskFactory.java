public class TaskFactory {
    public static Task createTask(String type, String title, int priority) {
        if (type.equalsIgnoreCase("simple")) {
            return new SimpleTask(title);
        } else if (type.equalsIgnoreCase("priority")) {
            return new PriorityTask(title, priority);
        }
        return null;
    }
}