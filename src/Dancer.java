public class Dancer extends Person {
    private String groupName;
public void dansing(){
    System.out.println(groupName+" "+"This is perfect group");

}
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +"name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ",groupName='" + groupName + '\'' +
                '}';
    }
}
