package gb.l1.competition.obstacles;

import gb.l1.competition.competitors.Competitor;

public class Cross implements Obstacle {
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        if(distance > 0) this.distance = distance;
    }

    @Override
    public void surmount(Competitor competitor) {
        if(competitor.isOnDistance())
        competitor.run(distance);
    }
}
