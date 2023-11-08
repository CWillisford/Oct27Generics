package GenericSports.BeforeGenerics;

import javax.swing.*;

public class SportTester1 {
    public static void main(String[] args) {

        Leagues<Team<FootballPlayer>> ggcLeague = new Leagues<>("GGC Open Football Leagues 2023");

        FootballPlayer jah = new FootballPlayer("jah");
        FootballPlayer kevin = new FootballPlayer("Kevin");
        FootballPlayer lincoln = new FootballPlayer("Lincoln");
        FootballPlayer blake = new FootballPlayer("Blake");
        FootballPlayer truong = new FootballPlayer("Truong");
        FootballPlayer haily = new FootballPlayer("Haily");

        SoccerPlayer gabe = new SoccerPlayer("Gabe");
        SoccerPlayer john = new SoccerPlayer("John");

        BaseballPlayer giovannie = new BaseballPlayer("Giovannie");

        Team<FootballPlayer> grizzlyFootball1 = new Team<FootballPlayer>("Grizzly Football Team 1");

        grizzlyFootball1.addPlayer(jah);
        grizzlyFootball1.addPlayer(kevin);

        Team<FootballPlayer> grizzlyFootball2 = new Team<FootballPlayer>("Grizzly Football Team 2");
        grizzlyFootball2.addPlayer(lincoln);
        grizzlyFootball2.addPlayer(blake);

        Team<FootballPlayer> grizzlyFootball3 = new Team<FootballPlayer>("Grizzly Football Team 3");
        grizzlyFootball2.addPlayer(truong);
        grizzlyFootball2.addPlayer(haily);

        //play games
        grizzlyFootball1.matchResult(grizzlyFootball2,27,34);
        grizzlyFootball1.matchResult(grizzlyFootball3,0,42);
        grizzlyFootball2.matchResult(grizzlyFootball1,15,15);
        grizzlyFootball2.matchResult(grizzlyFootball3,3,12);

        //compute the ranking of total scores of each team
        System.out.println("///Ranking Scores///");
        System.out.println(grizzlyFootball1.getTeamName() + ": " + grizzlyFootball1.ranking());
        System.out.println(grizzlyFootball2.getTeamName() + ": " + grizzlyFootball2.ranking());
        System.out.println(grizzlyFootball3.getTeamName() + ": " + grizzlyFootball3.ranking());

        ggcLeague.add(grizzlyFootball1);
        ggcLeague.add(grizzlyFootball2);
        ggcLeague.add(grizzlyFootball3);

        System.out.println(grizzlyFootball1.compareTo(grizzlyFootball2));
        System.out.println(grizzlyFootball2.compareTo(grizzlyFootball3));
        System.out.println(grizzlyFootball3.compareTo(grizzlyFootball1));

        System.out.println("///RANKING TABLE///");
        ggcLeague.rankingTable();
    }
}
