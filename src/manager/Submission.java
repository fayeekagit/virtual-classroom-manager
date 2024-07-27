package manager;

public class Submission {
    private String studentId;
    private String assignmentDetails;

    public Submission(String studentId, String assignmentDetails) {
        this.studentId = studentId;
        this.assignmentDetails = assignmentDetails;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getAssignmentDetails() {
        return assignmentDetails;
    }
}
