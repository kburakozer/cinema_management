package cinema.management;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("one", "Apocalypse");
//        map.put("two", "Yes Man");
//        map.put("three", "fight club");
//
//        for(String s : map.keySet()){
//            if(map.get(s).equals("Apocalypse")){
//                System.out.println("The room is " + s);
//            }
//        }

        Branch branch = new Branch("Akasya", "Istanbul");
        Hall h = new Hall("H1", 4,5);
        branch.addHall(h);
        Movie movie = new Movie("Scary Movie");
        h.setMovie(movie);

//        h.emptySeats();
//        h.reserve("A1");
//        h.reserve("B2");
//        h.reset();
//        h.emptySeats();
        branch.showMovies();


        // TODO program will show available branches and ask you to choose

        // TODO program will show the list of all movies available for the branch

        // TODO program will show all available seats according to seat order

        // TODO after reservation the program will update the income




    }
}
