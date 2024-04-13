import java.time.Year;

public
class Person {

    protected String name;
    protected String surname;
    protected String address;
    protected String email;
    protected String pesel;
    protected int employmentYear;

    public Person(String name, String surname, String address, String email, String pesel, int employmentYear) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.employmentYear = employmentYear;
    }

    public int salary() {
        return 3000 + (Year.now().getValue() - employmentYear) * 1000;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", pesel='" + pesel + '\'' +
                ", employmentYear=" + employmentYear;
    }
}