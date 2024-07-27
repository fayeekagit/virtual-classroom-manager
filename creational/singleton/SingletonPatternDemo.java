public class SingletonPatternDemo {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        connection1.connect();
        System.out.println(connection1 == connection2);  // true
    }
}
