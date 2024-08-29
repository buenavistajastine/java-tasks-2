//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // use constructor if data columns not large
        Self myself = new Self("Earl", 22);
        myself.updateCondition(false, true);

        System.out.println("My name is " + myself.getName() + ". \nI am " + myself.getAge() + " years old.");

        if (myself.getSick()) {
            System.out.println(myself.getName() + " needs rest.");
        } else {
            System.out.println(myself.getName() + " is feeling great.");
        }

        if (myself.getCanWork()) {
            System.out.println(myself.getName() + " can work.");
        } else {
            System.out.println(myself.getName() + " cannot work.");
        }

        DemoTest demo = new DemoTest();
        demo.bark();
        demo.scream();
    }
}