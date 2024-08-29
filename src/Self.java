public class Self extends Condition{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Parameters for using this method in the other class
    public void updateCondition(boolean isSick, boolean canWork) {
        setSick(isSick);
        setCanWork(canWork);
    }
}
