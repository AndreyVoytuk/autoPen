public class Pen implements WritingUtencil {
    protected int amount;
    protected int capacity;

    public Pen(int capacity) {
        this.capacity = capacity;
        this.amount = capacity;
    }

    public Pen() {
        this(4096);
    }

    public int getAmount() {
        return this.amount;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void refill() {
        this.amount = this.capacity;
    }

    public void write(Paper paper, String message)
        throws WritingUtencilException
    {
        if ( this.amount == 0 ) {
            throw new OutOfInkException();
        }
        if ( this.amount < message.length() ) {
            paper.addContent(message.substring(0, amount));
            amount = 0;
            return;
        }
        paper.addContent(message);
        amount -= message.length();
    }
}
