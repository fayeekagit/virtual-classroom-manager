package manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Classroom {
    private String name;
    private List<Student> students;
    private List<Assignment> assignments;
    private List<Submission> submissions; // Track submitted assignments

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
        this.submissions = new ArrayList<>();
        System.out.println("Classroom " + name + " created.");
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getId() + " added to classroom " + name + ".");
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
        System.out.println("Assignment added to classroom " + name + ": " + assignment.getDetails());
    }

    public void submitAssignment(String studentId, String assignmentDetails) {
        submissions.add(new Submission(studentId, assignmentDetails));
        System.out.println("Assignment submitted by Student " + studentId + " in " + name + ".");
    }

    public void listStudents() {
        System.out.println("Students in classroom " + name + ":");
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            for (Student student : students) {
                System.out.println("- " + student.getId());
            }
        }
    }

    public void listAssignments() {
        System.out.println("Assignments in classroom " + name + ":");
        if (assignments.isEmpty()) {
            System.out.println("No assignments scheduled.");
        } else {
            for (Assignment assignment : assignments) {
                System.out.println("- " + assignment.getDetails());
            }
        }
    }

    // New method to list submitted assignments
    public void listSubmittedAssignments() {
        System.out.println("Submitted assignments in classroom " + name + ":");
        if (submissions.isEmpty()) {
            System.out.println("No assignments submitted.");
        } else {
            for (Submission submission : submissions) {
                System.out.println("- Assignment: " + submission.getAssignmentDetails() + ", Submitted by Student: " + submission.getStudentId());
            }
        }
    }
}
