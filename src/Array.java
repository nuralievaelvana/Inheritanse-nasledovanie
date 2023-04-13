public class Array {
    private String [] name;

    public Array(String[] name) {
        this.name = name;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public void names(int index){
        for (int i = 0; i < name.length; i++) {
            if (i == index) {
                System.out.println(name[i]);
            }
        }
    }
}
