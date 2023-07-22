import javax.swing.*;
import java.awt.*;

class Label {
    JLabel imgIcon = new JLabel();
    ImageIcon img = new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\FlappyBird\\src\\Component\\flappybirdlogo.png");


}

class FrameWindow{
    JFrame frame = new JFrame();
    Label icon = new Label();

    FrameWindow(){
        frame.setSize(300,600);
        frame.setIconImage(icon.img.getImage());
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Flapy Bird");

    }
}