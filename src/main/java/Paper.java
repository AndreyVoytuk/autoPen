public class Paper {
    private int symbols;
    private StringBuilder content = new StringBuilder();

    public Paper(int symbols) {
        this.symbols = symbols;
    }

    public Paper() {
        this(1024);
    }

    public int getSymbols() {
        return this.symbols;
    }

    public void show() {
        System.out.println(this.content);
    }

    public void addContent(String message)
        throws WritingUtencilException
    {
        int total = content.length() + message.length();

        if ( content.length() == symbols ) {
            throw new OutOfSpaceException();
        }
        if ( total > symbols ) {
            content.append(message.substring(0, symbols-content.length()));
            return;
        }
        this.content.append(message);
    }
}
