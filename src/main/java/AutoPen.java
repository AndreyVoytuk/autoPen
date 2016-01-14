public class AutoPen extends Pen {
    private boolean isOpen;

    public AutoPen(int capacity) {
        super(capacity);
        isOpen = false;
    }

    public AutoPen() {
        this(4096);
    }

    public void click() {
        isOpen = !isOpen;
    }

    @Override
    public void write(Paper paper, String message)
        throws WritingUtencilException
    {
        if ( !isOpen ) {
            throw new ClosedPenException();
        }
        super.write(paper, message);
    }
}
