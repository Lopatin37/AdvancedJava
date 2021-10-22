package gb.l1.competition.competitors;

public class Sportsman  implements Competitor {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;
    private boolean isOnDistance;

    public Sportsman(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.isOnDistance = true;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    private void setOnDistance(boolean onDistance) {
        isOnDistance = onDistance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        if(maxRunDistance > 0)
        this.maxRunDistance = maxRunDistance;
    }

    public void setMaxJumpHeight(int maxJumpHeight) {
        if(maxJumpHeight > 0)
        this.maxJumpHeight = maxJumpHeight;
    }

    public void setMaxSwimDistance(int maxSwimDistance) {
        if (maxSwimDistance > 0)
        this.maxSwimDistance = maxSwimDistance;
    }

    @Override
    public void run(int distance) {
        if(getMaxRunDistance() >= distance) {
            System.out.println(getName() + " пробежал дистанцию");
        } else {
            System.out.println(getName() + " не смог пробежать дистанцию");
            setOnDistance(false);
        }
    }

    @Override
    public void jump(int height) {
        if(getMaxJumpHeight() >= height) {
            System.out.println(getName() + " перепрыгнул препятствие");
        } else {
            System.out.println(getName() + " не смог перепрыгнуть препятствие");
            setOnDistance(false);
        }
    }

    @Override
    public void swim(int distance) {
        if(getMaxSwimDistance() >= distance) {
            System.out.println(getName() + " проплыл дистанцию");
        } else {
            System.out.println(getName() + " не смог проплыть дистанцию");
            setOnDistance(false);
        }
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void info() {
        System.out.println(name);
    }
}
