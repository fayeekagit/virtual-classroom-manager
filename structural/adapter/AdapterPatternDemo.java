public class AdapterPatternDemo {
    public static void main(String[] args) {
        LegacySystem legacySystem = new LegacySystem();
        NewSystem newSystem = new LegacySystemAdapter(legacySystem);
        newSystem.request();
    }
}
