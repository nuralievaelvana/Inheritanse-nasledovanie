public class Cat extends Animal{
    private String breed;
    private String which;

    public Cat(String name, int weight, String breed, String which) {
        super(name, weight);
        this.breed = breed;
        this.which = which;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getWhich() {
        return which;
    }

    public void setWhich(String which) {
        this.which = which;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                "breed='" + breed + '\'' +
                ", which='" + which + '\'' +
                '}';
    }
}
