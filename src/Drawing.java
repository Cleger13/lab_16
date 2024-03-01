import javax.swing.*;
import java.awt.*;

public class Drawing extends JComponent{
    @Override
    public void paintComponent(Graphics g){
//                  Домик
        g.drawRect(50, 150, 150, 150);
        g.drawRect(75, 200, 50, 50);
        g.drawPolyline(new int[]{25, 125, 225},
                        new int[]{175, 75, 175}, 3);
        g.drawPolygon(new int[]{150, 150, 175, 175},
                        new int[]{75, 100, 125, 75}, 4);

//                  Земля
        g.drawLine(25, 300, 425, 300);

//                  Дерево
        g.drawPolyline(new int[]{340, 340, 360, 360},
                        new int[]{250, 300, 300, 250}, 4);
        g.drawArc(275, 50, 150, 200, 278, 344);
    }

    public static void main(String[] args){
        JFrame f = new JFrame("My drawing");
        Drawing draw = new Drawing();
        draw.setSize(400, 500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.add(draw);
        f.pack();
        f.setVisible(true);
    }
}