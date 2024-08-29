import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        // use constructor if data columns not large
        Self myself = new Self("Earl", 22);
        HashSet<Integer> nums = new HashSet<Integer>();
        nums.add(4);
        nums.add(6);
        nums.add(9);

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

        for ( Level myEnums: Level.values()) {
            System.out.println(myEnums);
        }

        for(int i = 1; i <= 10; i++) {
            if (nums.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
        DemoTest demo = new DemoTest();
        demo.bark();
        demo.scream();
    }
}