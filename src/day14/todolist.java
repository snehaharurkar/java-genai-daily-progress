package day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

    class Task {
        private int id;
        private String description;

        public Task(int id, String description) {
            this.id = id;
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public String getDescription() {
            return description;
        }
    }

    public class todolist {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            ArrayList<Task> tasks = new ArrayList<>();
            int idCounter = 1;

            while (true) {
                System.out.println("\n--- TODO MENU ---");
                System.out.println("1. Add Task");
                System.out.println("2. View Tasks");
                System.out.println("3. Delete Task");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                if (choice == 1) {
                    System.out.print("Enter task description: ");
                    String desc = sc.nextLine();

                    tasks.add(new Task(idCounter, desc));
                    idCounter++;

                    System.out.println("Task added successfully!");

                } else if (choice == 2) {

                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (Task t : tasks) {
                            System.out.println(t.getId() + " - " + t.getDescription());
                        }
                    }

                } else if (choice == 3) {

                    System.out.print("Enter task id to delete: ");
                    int deleteId = sc.nextInt();

                    boolean found = false;

                    Iterator<Task> it = tasks.iterator();

                    while (it.hasNext()) {
                        Task current = it.next();

                        if (current.getId() == deleteId) {
                            it.remove();
                            found = true;
                            System.out.println("Task deleted successfully!");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Task not found.");
                    }

                } else if (choice == 4) {
                    System.out.println("Exiting...");
                    break;

                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            }

            sc.close();
        }
    }


