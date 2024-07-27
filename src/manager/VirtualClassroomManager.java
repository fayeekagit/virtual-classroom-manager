package manager;

import java.util.HashMap;
import java.util.Map;

public class VirtualClassroomManager {
    private Map<String, Classroom> classrooms;

    public VirtualClassroomManager() {
        classrooms = new HashMap<>();
        System.out.println("VirtualClassroomManager initialized.");
    }

    public void addClassroom(String name) {
        if (!classrooms.containsKey(name)) {
            classrooms.put(name, new Classroom(name));
            System.out.println("Classroom " + name + " has been created.");
        } else {
            System.out.println("Classroom " + name + " already exists.");
        }
    }

    public void addStudent(String studentId, String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            Student student = new Student(studentId);
            classroom.addStudent(student);
            System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    public void scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            Assignment assignment = new Assignment(assignmentDetails);
            classroom.addAssignment(assignment);
            System.out.println("Assignment for " + className + " has been scheduled.");
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            boolean studentExists = classroom.getStudents().stream()
                    .anyMatch(student -> student.getId().equals(studentId));
            if (studentExists) {
                classroom.submitAssignment(studentId, assignmentDetails);
            } else {
                System.out.println("Student " + studentId + " is not enrolled in " + className + ".");
            }
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    public void listStudents(String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.listStudents();
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    public void listAssignments(String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.listAssignments();
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    // New method to list submitted assignments
    public void listSubmittedAssignments(String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.listSubmittedAssignments();
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }
}
