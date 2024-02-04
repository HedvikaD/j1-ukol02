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
       nakresliRovnostrannyTrojuhelnik(100.0, Color.red);
       nakresliCtvrerecek(200.0, Color.cyan);
       nakresliObdelnik(150.0, 250, Color.black);
       nakresliKolecko(20.0, new Color(130,250,105));

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
