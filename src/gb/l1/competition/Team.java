package gb.l1.competition;

import gb.l1.competition.competitors.Competitor;
import gb.l1.competition.competitors.Sportsman;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Competitor> competitors;

    public Team(String name, List<Competitor> competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public Team() {
        this.name = "default name";
        competitors = new ArrayList<>();
        competitors.add(new Sportsman("Alan", 15, 7, 10));
        competitors.add(new Sportsman("Bred", 22, 5, 12));
        competitors.add(new Sportsman("Charly", 17, 9, 14));
        competitors.add(new Sportsman("Diego", 20, 9, 11));
    }

    public void showAll(){
        System.out.println(competitors);
    }

    public void showCompetitorsOnDistance() {
        System.out.println("Участники на дистанции:");
        for (Competitor competitor:competitors) {
            if(competitor.isOnDistance()) competitor.info();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompetitors(List<Competitor> competitors) {
        this.competitors = competitors;
    }

    public String getName() {
        return name;
    }

    public List<Competitor> getCompetitors() {
        return competitors;
    }
}
