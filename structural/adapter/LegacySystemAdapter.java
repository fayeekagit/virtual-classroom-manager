class LegacySystemAdapter implements NewSystem {
    private LegacySystem legacySystem;

    public LegacySystemAdapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void request() {
        legacySystem.legacyRequest();
    }
}
