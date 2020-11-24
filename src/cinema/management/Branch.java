package cinema.management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Branch {
    // fields
    private final String name;
    private final String city;
    private List<Hall> halls;

    public Branch(String name, String city) {
        this.name = name;
        this.city = city;
        halls = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void addHall(Hall hall){
        halls.add(hall);
    }

    public void removeHall(Hall hall) {
        for(Hall h : halls){
            if(h.getId().equalsIgnoreCase(hall.getId())){
                halls.remove(h);
            }
        }
    }

    public void showMovies(){
        for(Hall h : halls){
            System.out.println(h.getMovie().getTitle());
        }
    }

}
