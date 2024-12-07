import javax.swing.*;
public class demo_executable{
    public static void main(String[]args){
        JFrame frame = new JFrame("demo_executable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        frame.add(label);

        frame.pack();
        frame.setVisible(true);

    }
}
class Dummy {
    //Just to have another thing to pack in the jar

}