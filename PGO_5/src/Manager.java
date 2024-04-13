import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public
class Manager
        extends Person {

    private List<Goal> goals;

    public Manager(String name, String surname, String address, String email, String pesel, int employmentYear) {
        super(name, surname, address, email, pesel, employmentYear);
        goals = new ArrayList<>();
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    public int salary() {
        int bonusSal = 0;

        for(Goal goal : goals) {
            if(goal.isFinishedOnTime())  bonusSal += goal.getBonus();
        }

        return super.salary() + bonusSal;
    }

    @Override
    public String toString() {
        return super.toString() + ", goals=" + goals + "}";
    }

    public List<Goal> getGoals() {
        return goals;
    }
}