package core.human;

public class Parent extends Human {
    private String profession;
    public Parent(String firstName, String lastName, String profession) {
        super(firstName, lastName);
        this.profession = profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Parent() {
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

}
