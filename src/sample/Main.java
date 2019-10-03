package sample;

import Beans.Theater;
import Beans.TicketSeller;
import Interface.Ticket;
import Tickets.NewTicket;
import Tickets.TestTicket;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Main extends Application {
    private TextArea text1;
    private TextArea text2;
    private TextArea text3;

    private TextField total1;
    private TextField total2;

    private TextField current1;
    private TextField current2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        initOtherControl(root);
        initButtonListener(root);
        primaryStage.setTitle("Theatre Ticketing");
        primaryStage.setScene(new Scene(root, 600, 650));
        primaryStage.show();
    }

    private void initButtonListener(Parent root) {
        Button start = (Button) root.lookup("#start");
        start.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                initTicketAndSeller();
                Theater.getInstance().startSelling();
            }
        });
    }

    private void initOtherControl(Parent root) {
        text1 = (TextArea) root.lookup("#text1");
        text2 = (TextArea) root.lookup("#text2");
        text3 = (TextArea) root.lookup("#text3");

        total1 = (TextField) root.lookup("#total1");
        total2 = (TextField) root.lookup("#total2");

        current1 = (TextField) root.lookup("#current1");
        current2 = (TextField) root.lookup("#current2");
    }

    private void initTicketAndSeller(){
        Ticket newTicket = new NewTicket(Integer.parseInt(total1.getText().trim()));
        Ticket textTicket = new TestTicket(Integer.parseInt(total2.getText().trim()));

        TicketSeller seller = new TicketSeller(newTicket,1,text1,current1);
        TicketSeller seller1 = new TicketSeller(newTicket,2,text2,current1);
        TicketSeller seller2 = new TicketSeller(textTicket,3,text3,current2);

        Theater.getInstance().addSeller(seller);
        Theater.getInstance().addSeller(seller1);
        Theater.getInstance().addSeller(seller2);

    }

    public static void main(String[] args) {
        launch(args);
    }

}


