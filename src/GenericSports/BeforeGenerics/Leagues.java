package GenericSports.BeforeGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leagues<T extends Team> {
    private String leagueName;

    private List<T> league = new ArrayList<T>();

    public Leagues(String name){
        this.leagueName=name;
    }

    public boolean add(T team){
        if(league.contains(team)){
            throw new IllegalArgumentException(team.getTeamName() + " is alread included in the league -" + leagueName);
        }
        league.add(team);
        return true;
    }

    public void rankingTable(){
        Collections.sort(league);
        for(T x : league){
            System.out.println(x.getTeamName() + ": " + x.ranking());
        }
    }
}
