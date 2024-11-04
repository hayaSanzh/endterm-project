public class PriorityTask extends Task {
    private int priority;

    public PriorityTask(String title, int priority) {
        super(title);
        this.priority = priority;
    }

    @Override
    public void displayTaskInfo() {
        System.out.println("Priority Task: " + title + " with priority " + priority);
    }
}
