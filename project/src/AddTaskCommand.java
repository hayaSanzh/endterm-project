public class AddTaskCommand implements Command {
    private TaskManager taskManager;
    private String type;
    private String title;
    private int priority;

    public AddTaskCommand(TaskManager taskManager, String type, String title, int priority) {
        this.taskManager = taskManager;
        this.type = type;
        this.title = title;
        this.priority = priority;
    }

    @Override
    public void execute() {
        taskManager.addTask(type, title, priority);
    }

    @Override
    public void undo() {
        System.out.println("Undoing task creation...");
    }
}