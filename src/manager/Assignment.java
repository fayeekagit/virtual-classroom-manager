package manager;

public class Assignment {
    private String details;

    public Assignment(String details) {
        this.details = details;
        System.out.println("Assignment created with details: " + details);
    }

    public String getDetails() {
        return details;
    }
}
