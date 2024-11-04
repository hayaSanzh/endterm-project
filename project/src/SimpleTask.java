public class SimpleTask extends Task {
    public SimpleTask(String title) {
        super(title);
    }

    @Override
    public void displayTaskInfo() {
        System.out.println("Simple Task: " + title);
    }
}