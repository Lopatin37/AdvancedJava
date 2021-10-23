package gb.l2.part1;

public enum DayOfWeek {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5),
    SATURDAY(6), SUNDAY(7);
    private int numberOfDay;
    DayOfWeek(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public void setNumberOfDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public int getWorkingHours(DayOfWeek dayOfWeek) {
        if(dayOfWeek.getNumberOfDay() > 5) return 0;
        return (6-dayOfWeek.getNumberOfDay())*8;
    }
}