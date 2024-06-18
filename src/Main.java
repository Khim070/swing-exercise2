import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Testing");

        f.setSize(400,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon img = new ImageIcon("assets/koala.png");
        f.setIconImage(img.getImage());
    }
}