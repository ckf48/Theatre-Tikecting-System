package Beans;

import Interface.Ticket;

public class TicketSeller implements Runnable {
    private Ticket ticket;
    private String name;

    public TicketSeller(Ticket ticket) {
        this.ticket = ticket;
        this.name = ticket.getClass().getSimpleName() + " " + this.getClass().getSimpleName();
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public synchronized void run() {
        while (!ticket.isEmpty()){
            String result = ticket.sellTicket();
            System.out.println(name + " " + result);
            LogTyper.getInstance().write(name + " " + result);
        }
    }


}
