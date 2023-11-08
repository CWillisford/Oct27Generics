package GenericSports.BeforeGenerics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Team <T extends Player> implements Comparable<Team<T>>{
    private String teamName;
    private int won;
    private int lost;
    private int tied;
    private int played;

    private List<T> members = new ArrayList<T>();

    public Team(String teamName){
        this.teamName=teamName;
    }

    public String getTeamName(){
        return teamName;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            throw new IllegalArgumentException(player.getName() + " is already in the team");
        }
        else{
            members.add(player);
            return true;
        }
    }

    public int getNumberOfPlayer(){
        return members.size();
    }

    public void matchResult(Team<T> opponentTeam, int ourScore, int theirScore){
        if(opponentTeam == null){
            throw new IllegalArgumentException(opponentTeam.getTeamName() + " cannot be null");
        }
        if(ourScore > theirScore){
            won++;
        }
        else if(ourScore < theirScore){
            lost++;
        }
        else{
            tied++;
        }
        played++;

        if(theirScore > ourScore){
            opponentTeam.won++;
        }
        else if(theirScore < ourScore){
            opponentTeam.lost++;
        }
        else{
            opponentTeam.tied++;
        }
        opponentTeam.played++;
    }

    public int ranking(){
        return won*2+tied;
    }

    public int compareTo(Team<T> team){
        if(this.ranking() > team.ranking()){
            return -1;
        }
        else if(this.ranking() < team.ranking()){
            return 1;
        }
        else{
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Team){
            Team<T> xTeam = (Team<T>) obj;
            if(this.teamName.equals(xTeam.getTeamName())){
                return true;
            }
        }
        return false;
    }
}
