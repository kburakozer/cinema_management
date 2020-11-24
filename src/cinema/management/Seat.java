package cinema.management;

import java.util.Scanner;

public class Seat {

    private boolean reserved;
    private String id;

    public Seat(String id){
        this.id = id;
        this.reserved = false;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public String getId() {
        return id;
    }
}
