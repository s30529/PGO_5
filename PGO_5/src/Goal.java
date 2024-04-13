import java.util.Date;

public
class Goal {

    private String name;
    private Date dueToDate;
    private Date finishDate;
    private int bonus;

    public Goal(String name, Date dueToDate, int bonus) {
        this.name = name;
        this.dueToDate = dueToDate;
        this.bonus = bonus;
        finishDate = null;
    }

    public boolean isFinishedOnTime() {
        return finishDate != null &&
                finishDate.getMonth() == dueToDate.getMonth() && finishDate.getYear() == dueToDate.getYear();
    }

    @Override
    public String toString() {
        return name + ", due to: " + dueToDate + " finish date: " +
                (finishDate != null ? finishDate : "not finished yet") + ", bonus: " + bonus;
    }

    public String getName() {
        return name;
    }

    public Date getDueToDate() {
        return dueToDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public int getBonus() {
        return bonus;
    }
}