import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public
class Tester
        extends Person {

    private Set<Test> tests;

    public Tester(String name, String surname, String address, String email, String pesel, int employmentYear) {
        super(name, surname, address, email, pesel, employmentYear);
        tests = new HashSet<>();
    }

    @Override
    public int salary() {
        return super.salary() + 300 * tests.size();
    }

    public void addTest(Test test) {
        tests.add(test);
    }

    @Override
    public String toString() {
        return super.toString() + ", tests: " + Arrays.toString(tests.toArray()) + "}";
    }

    public Set<Test> getTests() {
        return tests;
    }

}