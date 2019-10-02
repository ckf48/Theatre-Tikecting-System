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
        TicketSeller seller = new TicketSeller(ticket,1);
        TicketSeller seller1 = new TicketSeller(ticket1,2);
        TicketSeller seller2 = new TicketSeller(ticket,3);
        Theater.getInstance().addSeller(seller);
        Theater.getInstance().addSeller(seller1);
        Theater.getInstance().addSeller(seller2);
        Theater.getInstance().startSelling();
    }
}
