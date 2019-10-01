package Beans;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private static Theater instance = new Theater();

    private List<TicketSolder> solders = new ArrayList<>();

    private Theater() {
    }

    public static Theater getInstance() {
        return instance;
    }

    public void addSolder(TicketSolder solder){
        solders.add(solder);
    }

    public void cleanSolders(){
        solders.clear();
    }
}
