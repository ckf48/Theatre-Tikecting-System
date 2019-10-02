package Beans;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private static Theater instance = new Theater();

    private List<TicketSeller> sellers = new ArrayList<>();

    private Theater() {
    }

    public static Theater getInstance() {
        return instance;
    }

    public void addSeller(TicketSeller solder){
        sellers.add(solder);
    }

    public void cleanSolders(){
        sellers.clear();
    }

    public void startSelling(){
        for(TicketSeller seller : sellers){
            new Thread(seller).start();
        }
    }
}
