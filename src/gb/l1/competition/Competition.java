package gb.l1.competition;

import gb.l1.competition.competitors.Competitor;
import gb.l1.competition.obstacles.Obstacle;

public class Competition {
    private Team team;
    private Trial trial;

    public Competition(Team team, Trial trial) {
        this.team = team;
        this.trial = trial;
    }

    public Competition() {
        team = new Team();
        trial = new Trial();
    }


    public void setTeam(Team team) {
        this.team = team;
    }

    public void setTrial(Trial trial) {
        this.trial = trial;
    }

    public Team getTeam() {
        return team;
    }

    public Trial getTrial() {
        return trial;
    }

    public void start(){
        for (Competitor competitor:team.getCompetitors()) {
            for (Obstacle obstacle:trial.getObstacles()) {
                obstacle.surmount(competitor);
            }
        }
        showWinners();
    }

    public void showWinners() {
        team.showCompetitorsOnDistance();
    }

    public void showTeam() {
        team.showAll();
    }
}
