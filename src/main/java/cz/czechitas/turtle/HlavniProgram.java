package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.
     /**
       nakresliRovnostrannyTrojuhelnik(100.0, Color.red);
       nakresliCtvrerecek(200.0, Color.cyan);
      */

       zofka.penUp();
       zofka.turnRight(180);
       zofka.move(500);
       zofka.turnRight(180);
       zofka.penDown();
       zofka.turnRight(90);
       nakresliObdelnik(150.0, 250, new Color(195,100,61));
       zofka.turnRight(90);
       nakresliKolecko(20.0, new Color(195,100,61));
       zofka.turnRight(180);
       nakresliObdelnik(150.0, 250, new Color(195,100,61));
       zofka.turnLeft(90);
       zofka.move(250);
       zofka.turnRight(90);
       nakresliRovnostrannyTrojuhelnik(150.0, new Color(195,100,61));
       zofka.turnRight(90);
       zofka.move(70);
       zofka.turnLeft(180);
       nakresliKolecko(12.0, new Color(195,100,61));
       zofka.turnLeft(180);
       zofka.move(120);
       zofka.turnLeft(180);
       nakresliKolecko(12.0, new Color(195,100,61));
       zofka.penUp();
       zofka.turnRight(90);
       zofka.move(500);
       zofka.penDown();
       zofka.turnLeft( 97.5);
       nakresliKolecko(25, Color.cyan);
       zofka.turnLeft(180);
       nakresliKolecko(20, Color.cyan);
       zofka.turnLeft(30);
       zofka.penUp();
       zofka.move(120);
       zofka.turnRight(45);
       zofka.penDown();
       nakresliKolecko(8.0, Color.cyan);
       zofka.penUp();
       zofka.turnRight(180);
       zofka.move(170);
       zofka.turnRight(90);
       zofka.penDown();
       nakresliKolecko(8.0, Color.cyan);
       zofka.penUp();
       zofka.turnRight(45);
       zofka.move(100);
       zofka.turnRight(15);
       zofka.penDown();
       nakresliKolecko(12, Color.cyan);
       zofka.turnRight(15);
       zofka.penUp();
       zofka.move(300);
       zofka.turnRight(68);
       zofka.penDown();
       nakresliKolecko(20, new Color(255,204,255));
       nakresliRovnostrannyTrojuhelnik(140.0, new Color(255,204,155));


    }
    public void nakresliRovnostrannyTrojuhelnik (double velikostStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 3; i++) {
            zofka.move(velikostStrany);
            zofka.turnLeft(120);
        }
    }
    public void nakresliCtvrerecek (double velikostStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
            zofka.move(velikostStrany);
            zofka.turnLeft(90);
        }
    }
    public void nakresliObdelnik (double velikostStranyA, double velikostStranyB, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStranyA);
            zofka.turnLeft(90);
            zofka.move(velikostStranyB);
            zofka.turnLeft(90);
        }
    }
    public void nakresliKolecko (double velikostStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 24; i++) {
            zofka.move(velikostStrany);
            zofka.turnLeft(15);

        }


    }
}
