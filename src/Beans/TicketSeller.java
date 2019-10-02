package Beans;

import Interface.Ticket;

public class TicketSeller implements Runnable {
    private Ticket ticket;
    private String name;
    private int index;

    public TicketSeller(Ticket ticket, int index) {
        this.ticket = ticket;
        this.name = ticket.getClass().getSimpleName() + " " + this.getClass().getSimpleName();
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public synchronized void run() {
        while (!ticket.isEmpty()) {
            String result = "No." + index + " " + name + " " + ticket.sellTicket();
            System.out.println(result);
            LogTyper.getInstance().write(result);
        }
    }


}
