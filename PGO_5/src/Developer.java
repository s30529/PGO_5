import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public
class Developer
        extends Person {

    private Set<Technology> technologies;

    public Developer(String name, String surname, String address, String email, String pesel, int employmentYear) {
        super(name, surname, address, email, pesel, employmentYear);
        technologies = new HashSet<>();
    }

    @Override
    public int salary() {
        int bonusSal = 0;

        for(Technology tech : technologies) {
            bonusSal += tech.getValue();
        }

        return super.salary() + bonusSal;
    }

    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }

    @Override
    public String toString() {
        return super.toString() + ", technologies=" + Arrays.toString(technologies.toArray()) + "}";
    }

    public Set<Technology> getTechnologies() {
        return technologies;
    }
}