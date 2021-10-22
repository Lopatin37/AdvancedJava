package gb.l1.competition.obstacles;

import gb.l1.competition.competitors.Competitor;

public class Water implements Obstacle {
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void surmount(Competitor competitor) {
        if(competitor.isOnDistance())
        competitor.swim(distance);
    }

    public void setDistance(int distance) {
        if (distance > 0) this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
