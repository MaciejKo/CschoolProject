package core.human;

public class Parent extends Human {
    private String profession;
    public Parent(String firstName, String lastName, String profession) {
        super(firstName, lastName);
        this.profession = profession;
    }
}
