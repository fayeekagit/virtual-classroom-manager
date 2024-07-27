class EmailClient implements Observer {
    @Override
    public void update(String message) {
        System.out.println("EmailClient received message: " + message);
    }
}
