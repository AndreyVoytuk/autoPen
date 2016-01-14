public class PPMain {
    public static void main(String[] args)
        throws WritingUtencilException
    {
        AutoPen pen = new AutoPen();
        Paper paper = new Paper();

        pen.click();
        pen.write(paper, "I'm the JAVA!");
        paper.show();
    }
}
