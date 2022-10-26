package com.test.Test.usecase;

import com.test.Test.model.TeamDTO;

import java.util.ArrayList;
import java.util.List;

public class ProcessDataUseCase {
    public List<TeamDTO> createTeams() {
        List<TeamDTO> Teams = new ArrayList<>();
        Teams.add(new TeamDTO("Bayern Munich", "Alemania", 1971));
        Teams.add(new TeamDTO("Inter Milan", "Italia", 1897));
        Teams.add(new TeamDTO("AC Milan", "Italia", 1906));
        Teams.add(new TeamDTO("Barcelona", "España", 1869));
        Teams.add(new TeamDTO("Napoli", "Italia", 1869));
        Teams.add(new TeamDTO("PSG", "Francia", 1868));
        Teams.add(new TeamDTO("Villarreal", "España", 1862));
        Teams.add(new TeamDTO("Tottenham Hotspur", "Inglaterra", 1861));
        Teams.add(new TeamDTO("Manchester City", "Inglaterra", 2020));
        Teams.add(new TeamDTO("Atlético Madrid", "España", 1837));
        Teams.add(new TeamDTO("Real Madrid", "España", 2031));
        Teams.add(new TeamDTO("Ajax", "Holanda", 1908));
        Teams.add(new TeamDTO("Chelsea FC", "Inglaterra", 1847));
        Teams.add(new TeamDTO("Benfica", "Portugal", 1829));
        Teams.add(new TeamDTO("Arsenal", "Inglaterra", 1840));
        Teams.add(new TeamDTO("Palmeiras", "Brasil", 1840));
        Teams.add(new TeamDTO("Flamengo", "Brasil", 1844));
        Teams.add(new TeamDTO("FC Porto", "Portugal", 1830));
        Teams.add(new TeamDTO("Liverpool FC", "Inglaterra", 1994));
        Teams.add(new TeamDTO("Real Betis", "España", 1783));
        Teams.add(new TeamDTO("Borussia Dortmund", "Alemania", 1805));
        Teams.add(new TeamDTO("Sporting", "Portugal", 1760));
        Teams.add(new TeamDTO("PSV Eindhoven", "Holanda", 1759));
        Teams.add(new TeamDTO("Roma", "Italia", 1779));
        Teams.add(new TeamDTO("RB Leipzig", "Alemania", 1775));
        Teams.add(new TeamDTO("Union Berlin", "Alemania", 1777));
        Teams.add(new TeamDTO("Red Bull Salzburg", "Austria", 1755));
        Teams.add(new TeamDTO("Lazio", "Italia", 1789));
        Teams.add(new TeamDTO("Atalanta", "Italia", 1760));
        Teams.add(new TeamDTO("Flora Tallinn", "Estonia", 1726));
        Teams.add(new TeamDTO("Rangers", "Escocia", 1759));
        Teams.add(new TeamDTO("Real Sociedad", "España", 1723));
        Teams.add(new TeamDTO("Star Belgrade", "Serbia", 1759));
        Teams.add(new TeamDTO("Sevilla", "España", 1737));
        Teams.add(new TeamDTO("Marseille", "Francia", 1725));
        Teams.add(new TeamDTO("Newcastle United", "Inglaterra", 1725));
        Teams.add(new TeamDTO("Bayer Leverkusen", "Alemania", 1752));
        Teams.add(new TeamDTO("Brighton & Hove Albion", "Inglaterra", 1735));
        Teams.add(new TeamDTO("Monaco", "Francia", 1723));
        Teams.add(new TeamDTO("Freiburg", "Alemania", 1710));
        Teams.add(new TeamDTO("Feyenoord", "Holanda", 1709));
        Teams.add(new TeamDTO("Slavia Prague R.", "Checa", 1719));
        Teams.add(new TeamDTO("Celtic", "Escocia", 1716));
        Teams.add(new TeamDTO("Shakhtar Donetsk", "Ucrania", 1709));
        Teams.add(new TeamDTO("Manchester United", "Inglaterra", 1709));
        Teams.add(new TeamDTO("River Plate", "Argentina", 1699));
        Teams.add(new TeamDTO("Olympiakos", "Grecia", 1704));
        Teams.add(new TeamDTO("Lyon", "Francia", 1707));
        Teams.add(new TeamDTO("Juventus", "Italia", 1798));
        Teams.add(new TeamDTO("Atlético Mineiro", "Brasil", 1703));
        return Teams;
    }
}
