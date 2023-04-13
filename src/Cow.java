public class Cow extends Animal{
    private String color;
    private String voiume;

    public Cow(String name, int weight, String color, String voiume) {
        super(name, weight);
        this.color = color;
        this.voiume = voiume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVoiume() {
        return voiume;
    }

    public void setVoiume(String voiume) {
        this.voiume = voiume;
    }

    @Override
    public String toString() {
        return "Cow{" + "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                "color='" + color + '\'' +
                ", voiume='" + voiume + '\'' +
                '}';
    }
}
