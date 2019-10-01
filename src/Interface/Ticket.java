package Interface;

public abstract class Ticket {
    private int number;
    private String kind;

    public boolean soldTicket() {
        if (number > 0) {
            number--;
            return true;
        } else {
            return false;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
