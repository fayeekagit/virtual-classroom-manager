package manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VirtualClassroomManager manager = new VirtualClassroomManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            String[] parts = command.split(" ", 4); // Adjust to handle up to 4 parts

            try {
                switch (parts[0]) {
                    case "add_classroom":
                        if (parts.length == 2) {
                            manager.addClassroom(parts[1]);
                        } else {
                            System.out.println("Usage: add_classroom [class_name]");
                        }
                        break;
                    case "add_student":
                        if (parts.length == 3) {
                            manager.addStudent(parts[1], parts[2]);
                        } else {
                            System.out.println("Usage: add_student [student_id] [class_name]");
                        }
                        break;
                    case "schedule_assignment":
                        if (parts.length == 3) {
                            manager.scheduleAssignment(parts[1], parts[2]);
                        } else {
                            System.out.println("Usage: schedule_assignment [class_name] [assignment_details]");
                        }
                        break;
                    case "submit_assignment":
                        if (parts.length == 4) {
                            manager.submitAssignment(parts[1], parts[2], parts[3]);
                        } else {
                            System.out.println("Usage: submit_assignment [student_id] [class_name] [assignment_details]");
                        }
                        break;
                    case "list_students":
                        if (parts.length == 2) {
                            manager.listStudents(parts[1]);
                        } else {
                            System.out.println("Usage: list_students [class_name]");
                        }
                        break;
                    case "list_assignments":
                        if (parts.length == 2) {
                            manager.listAssignments(parts[1]);
                        } else {
                            System.out.println("Usage: list_assignments [class_name]");
                        }
                        break;
                    case "list_submitted_assignments":
                        if (parts.length == 2) {
                            manager.listSubmittedAssignments(parts[1]);
                        } else {
                            System.out.println("Usage: list_submitted_assignments [class_name]");
                        }
                        break;
                    default:
                        System.out.println("Invalid command.");
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid command format.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
