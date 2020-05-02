import java.lang.reflect.Array;
import java.util.ArrayList;

public class League<T extends Player> {

    private ArrayList<Team<T>> teams;

    public void addToTeam(Team<T> team){
        teams.add(team);
    }

    public void printLeague(){
        teams.sort((x, y) -> x.compareTo(y) );
        for(Team<T>team : teams){
            System.out.println(  team.getName()+" ranking : "+team.ranking());
        }
    }

    public Team<T> findTeam(String name){
        for(Team<T> team : teams){
            if(team.getName().equalsIgnoreCase(name)){
                return team;
            }
        }
        return null;
    }
}


