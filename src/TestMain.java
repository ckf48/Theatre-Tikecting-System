import Tickets.NewTicket;
import Tickets.TestTicket;
import Beans.Theater;
import Beans.TicketSeller;
import Interface.Ticket;

public class TestMain {
    public static void main(String [] args){
        Theater.getInstance().cleanSolders();
        Ticket ticket = new TestTicket(10);
        Ticket ticket1 = new NewTicket(10);
        TicketSeller seller = new TicketSeller(ticket);
        TicketSeller seller1 = new TicketSeller(ticket1);
        Theater.getInstance().addSeller(seller);
        Theater.getInstance().addSeller(seller1);
        Theater.getInstance().startSelling();
    }
}
