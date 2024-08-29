class DemoTest implements Animal, Animal2 {

    @Override
    public void bark() {
        System.out.println("It barks.");
    }

    @Override
    public void scream() {
        System.out.println("It screams.");
    }
}
