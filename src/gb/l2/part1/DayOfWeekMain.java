package gb.l2.part1;

public class DayOfWeekMain {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        System.out.println(dayOfWeek.getWorkingHours(DayOfWeek.FRIDAY));
    }
}
