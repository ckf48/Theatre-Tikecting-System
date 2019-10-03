package Interface;


import java.util.Vector;


public abstract class Ticket {
    private String name;
    private Vector<Integer> tickets;
    private int totalNumber;

    protected Ticket(int number) {
        name = this.getClass().getSimpleName();
        tickets = new Vector<>();
        totalNumber = number;

        for (int i = 0; i < number; i++)
            tickets.add(i);

    }

    public boolean isEmpty() {
        return tickets.isEmpty();
    }

    private synchronized int getTicket() {
        if (isEmpty())
            return 0;
        int random = (int) (Math.random() * (tickets.size()));
        int get = tickets.get(random);
        tickets.remove(random);
        return get;
    }

    public synchronized String sellTicket() {
        final int sellNumber = getTicket() + 1;
        if (sellNumber == 0)
            return null;
        return "has sold " + name + " No: " + sellNumber;
    }

    public synchronized int getCurrentNumber() {
        return tickets.size();
    }

    public int getTotalNumber() {
        return totalNumber;
    }
}
