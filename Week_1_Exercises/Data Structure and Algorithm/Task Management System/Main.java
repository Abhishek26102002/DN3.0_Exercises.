public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Task task1 = new Task(1, "Task 1", false);
        Task task2 = new Task(2, "Task 2", true);
        Task task3 = new Task(3, "Task 3", false);

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        System.out.println("All tasks:");
        taskManager.traverseTasks();

        System.out.println("Search for Task with ID 2:");
        System.out.println(taskManager.searchTask(2));

        System.out.println("Deleting Task with ID 2");
        taskManager.deleteTask(2);

        System.out.println("All tasks after deletion:");
        taskManager.traverseTasks();
    }
}