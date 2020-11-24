package cinema.management;

import java.util.*;

public class Hall {

    private int income = 0;

    private Movie movie;
    private String id;
    private int rows;
    private int maxSeatNumber;

    // field
    List<Seat> seats;


    public Hall(String id, int rows, int maxSeatNumber) {
        this.id = id;
        this.rows = rows;
        this.maxSeatNumber = maxSeatNumber;
        this.seats = new ArrayList<>();
        for (char i = 'A'; i < 'A' + rows; i++) {
            for (int j = 1; j <= maxSeatNumber; j++) {
                String seatId = "" + i + j;
                Seat seat = new Seat(seatId);
                seats.add(seat);
            }
        }
    }

    // show emptySeats in order
    public void emptySeats() {
        int k = 0;
        for (char i = 'A'; i < 'A' + rows; i++) {
            for (int j = 1; j <= maxSeatNumber; j++) {
                if (!seats.get(k).isReserved()) {
                    System.out.print(seats.get(k).getId());
                    System.out.print(" ");
                } else {
                    System.out.print("XX");
                    System.out.print(" ");
                }
                k++;
            }
            System.out.println("");
        }
    }

    // reservation
    public void reserve(String seat) {
        for (Seat s : seats) {
            if (s.getId().equalsIgnoreCase(seat) && !s.isReserved()) {
                System.out.println("=====================================");
                System.out.println("Seat " + seat + " has been reserved");
                System.out.println("=====================================");
                s.setReserved(true);
                setIncome();
            } else if (s.getId().equalsIgnoreCase(seat) && s.isReserved()) {
                System.out.println("The seat is not available");
                System.out.println();
                System.out.println("Available seats are: ");
                System.out.println();
                emptySeats();
            }
        }

    }

    // increase the income
    public void setIncome(){
        income += 15;
    }


    // reset the seats
    public void reset(){
        for(Seat s:seats){
            s.setReserved(false);
        }
    }

    public String getId () {
            return id;
        }

    // returns the income
    public int getIncome() {
        return income;
    }

    // setMovie name
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
