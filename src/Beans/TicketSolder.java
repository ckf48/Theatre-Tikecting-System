package Beans;

import Interface.Ticket;

public class TicketSolder implements Runnable {

    private Ticket ticket;

    public TicketSolder(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void run() {

    }
}
