package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    int delkaStrany = 80;

    nakreslitPrasatko(delkaStrany);

    //nakreslitSlunicko(20);



  }

  public void paprsek(int velikostKolecka){
    int delkaPaprsku = velikostKolecka * 2;
    zofka.turnLeft(100);
    zofka.move(delkaPaprsku);
    zofka.turnRight(180);
    zofka.penUp();
    zofka.move(delkaPaprsku);
    zofka.turnLeft(80);
    zofka.penDown();
  }

  public void nakreslitSlunicko(int velikostKolecka){
    for (int i = 0; i < 12; i++) {
        zofka.move(velikostKolecka);
        zofka.turnRight(15);
        zofka.move(velikostKolecka);
        zofka.turnRight(15);
        paprsek(velikostKolecka);
    }
  }

  public void nakreslitDomecek(int stranaDomecku) {
    for (int i = 0; i < 4; i++) {
      zofka.move(stranaDomecku);
      zofka.turnRight(90);
    }
    zofka.penUp();
    zofka.move(stranaDomecku);
    zofka.penDown();
    zofka.turnRight(45);
    zofka.move(stranaDomecku*(0.7));
    zofka.turnRight(90);
    zofka.move(stranaDomecku*(0.7));
  }

  public void nakreslitDveNozicky(int delkaNozicky) {
    zofka.turnLeft(45);
    zofka.penDown();
    zofka.move(delkaNozicky);
    zofka.penUp();
    zofka.turnRight(135);
    zofka.move(delkaNozicky*(1.5));
    zofka.turnRight(135);
    zofka.penDown();
    zofka.move(delkaNozicky);
  }

  public void nakreslitPrasatko(int delkaStrany) {
    int delkaNozicky = delkaStrany / 5;
    zofka.turnLeft(90);
    nakreslitDomecek(delkaStrany);
    zofka.turnRight(135);
    zofka.move(delkaStrany);
    nakreslitDveNozicky(delkaNozicky);
    zofka.turnRight(45);
    zofka.move(delkaStrany);
    zofka.turnRight(90);
    nakreslitDveNozicky(delkaNozicky);
  }

}
