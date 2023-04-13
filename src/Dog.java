public class Dog extends Animal{
    private String names;
    private int age;

    public Dog(String name, int weight, String names, int age) {
        super(name, weight);
        this.names = names;
        this.age = age;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                "names='" + names + '\'' +
                ", age=" + age +
                '}';
    }
}
