package gb.l1.competition.obstacles;

import gb.l1.competition.competitors.Competitor;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void surmount(Competitor competitor) {
        if(competitor.isOnDistance())
        competitor.jump(height);
    }

    public void setHeight(int height) {
        if(height > 0) this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
