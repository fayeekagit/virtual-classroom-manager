package manager;

public class Student {
    private String id;

    public Student(String id) {
        this.id = id;
        System.out.println("Student " + id + " created.");
    }

    public String getId() {
        return id;
    }
}
