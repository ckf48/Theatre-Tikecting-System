package Beans;

import Interface.Ticket;
import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;



public class TicketSeller implements Runnable {
    private Ticket ticket;
    private String name;
    private int index;
    private TextArea text;
    private TextArea current;

    public TicketSeller(Ticket ticket, int index,TextArea text,TextArea current) {
        this.ticket = ticket;
        this.name = ticket.getClass().getSimpleName() + " " + this.getClass().getSimpleName();
        this.index = index;
        this.current = current;
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public synchronized void run() {
        Platform.runLater(()->{
            text.clear();
        });

        while (!ticket.isEmpty()) {
            String result = "Window." + index + " " + name + " " + ticket.sellTicket();
            Platform.runLater(()->{
                text.appendText(result + "\n");
            });

//            Platform.runLater(()->{
//                current.setText(String.valueOf(ticket.getCurrentNumber()));
//            });

            LogTyper.getInstance().write(result);
        }
    }


}
