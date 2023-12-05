public class Person {
    private String name;
    private int yearOfBirth;
    private String address;

    public Person(String name) {
        this.name = name;
        this.address = "";
    }

    // gette setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return this.yearOfBirth;
    }

    public void setYob(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Person object = new Person("king");
        System.out.println(object.getName());
    }
}
