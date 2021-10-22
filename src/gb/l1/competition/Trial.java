package gb.l1.competition;

import gb.l1.competition.obstacles.Cross;
import gb.l1.competition.obstacles.Obstacle;
import gb.l1.competition.obstacles.Wall;
import gb.l1.competition.obstacles.Water;

import java.util.ArrayList;
import java.util.List;

public class Trial {
    private List<Obstacle> obstacles;

    public Trial() {
        obstacles = new ArrayList<>();
        obstacles.add(new Wall(7));
        obstacles.add(new Water(11));
        obstacles.add(new Cross(17));
    }

    public Trial(List<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    public void setObstacles(List<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    public List<Obstacle> getObstacles() {
        return obstacles;
    }
}
