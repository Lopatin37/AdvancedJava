package gb.l1.competition.competitors;

public interface Competitor {
    void run(int distance);
    void jump(int height);
    void swim(int distance);
    boolean isOnDistance();
    void info();
}
