package cinema.management;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Branch> branches;
    private final String name;

    public Company(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(Branch branch){
        branches.add(branch);
    }
    public void remove(Branch branch){
        branches.remove(branch);
    }
}
