package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //rozmery
    int delkaStrany = 80;
    int velikostKolecka = 10;
    int velikostPismen = 100;

    //prasatko
    zofka.turnRight(180);
    zofka.penUp();
    zofka.move(60);
    zofka.turnRight(180);
    nakreslitPrasatko(delkaStrany);

    zofka.penUp();
    zofka.turnRight(45);
    zofka.move(delkaStrany+50);

    //domecek dole vpravo
    zofka.penDown();
    zofka.turnLeft(90);
    nakreslitDomecek(delkaStrany);

    zofka.turnRight(45);
    zofka.turnRight(180);
    zofka.penUp();
    zofka.move(delkaStrany);
    zofka.turnLeft(90);
    zofka.move(delkaStrany);

    //pet domecku
    zofka.penDown();
    zofka.turnRight(90);
    nakreslitDomecek(delkaStrany);

    for (int i = 0; i < 4; i++) {
      zofka.turnRight(135);
      zofka.penUp();
      zofka.move(delkaStrany);
      zofka.move(delkaStrany/2);
      zofka.turnLeft(90);
      zofka.move(delkaStrany);
      zofka.turnRight(90);
      zofka.move(delkaStrany);
      zofka.turnRight(90);
      zofka.penDown();
      nakreslitDomecek(delkaStrany);
    }

    //domecek dole vlevo
    zofka.turnRight(135);
    zofka.penUp();
    zofka.move(delkaStrany);
    zofka.turnLeft(90);
    for (int i = 0; i < 3; i++) {
      zofka.move(delkaStrany);
    }
    zofka.turnRight(180);
    zofka.penDown();
    nakreslitDomecek(delkaStrany);
    zofka.turnRight(135);
    zofka.penUp();

    zofka.move(delkaStrany);
    zofka.turnLeft(90);
    zofka.move(delkaStrany*3);
    zofka.turnLeft(90);
    zofka.move(delkaStrany);
    zofka.turnLeft(90);

    //podpis
    napisI(velikostPismen);
    napisN(velikostPismen);
    napisK(velikostPismen);
    napisY(velikostPismen);

    //slunicko
    zofka.move(velikostPismen);
    zofka.move(delkaStrany*4);
    zofka.turnLeft(90);
    zofka.move(delkaStrany*5);
    nakreslitSlunicko(velikostKolecka);




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
    zofka.penDown();
    for (int i = 0; i < 12; i++) {
        zofka.move(velikostKolecka);
        zofka.turnRight(15);
        zofka.move(velikostKolecka);
        zofka.turnRight(15);
        paprsek(velikostKolecka);
    }
  }

  public void nakreslitDomecek(int stranaDomecku) {
    zofka.penDown();
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
    zofka.penDown();
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

  public void napisI(int velikostPismen){
    zofka.penDown();
    zofka.turnLeft(270);
    zofka.move(velikostPismen/5);
    zofka.turnLeft(180);
    zofka.move((velikostPismen/5)/2);
    zofka.turnRight(90);
    zofka.move(velikostPismen);
    zofka.turnLeft(90);
    zofka.move((velikostPismen/5)/2);
    zofka.turnLeft(180);
    zofka.move(velikostPismen/5);

    zofka.penUp();
    zofka.move(velikostPismen/3);
    zofka.turnRight(90);
    zofka.move(velikostPismen);
    zofka.turnLeft(180);
  }

  public void napisN(int velikostPismen){
    zofka.penDown();
    zofka.move(velikostPismen);
    zofka.turnRight(150);
    zofka.move(velikostPismen*(1.2));
    zofka.turnLeft(150);
    zofka.move(velikostPismen);

    zofka.turnRight(90);
    zofka.penUp();
    zofka.move(velikostPismen/3);
    zofka.turnRight(90);
    zofka.move(velikostPismen);
    zofka.turnLeft(180);
  }

  public void napisK(int velikostPismen){
    zofka.penDown();
    zofka.move(velikostPismen);
    zofka.turnRight(180);
    zofka.move(velikostPismen/2);
    zofka.turnLeft(30);
    zofka.move(velikostPismen*(0.57));
    zofka.turnRight(180);
    zofka.move(velikostPismen*(0.57));
    zofka.turnRight(60);
    zofka.move(velikostPismen*(0.57));
    zofka.turnRight(60);

    zofka.penUp();
    zofka.move(velikostPismen/3);
    zofka.turnRight(90);
    zofka.move(velikostPismen);
    zofka.turnLeft(180);
  }

  public void napisY(int velikostPismen){
    zofka.penDown();
    zofka.move((velikostPismen*2)/3);
    zofka.turnLeft(30);
    zofka.move((velikostPismen/3)*(0.9));
    zofka.turnRight(120);
    zofka.penUp();
    zofka.move((velikostPismen/3)*(1.1));
    zofka.turnRight(120);
    zofka.penDown();
    zofka.move((velikostPismen/3)*(0.9));

    zofka.penUp();
    zofka.turnLeft(120);
    zofka.move(velikostPismen/3);
    zofka.turnRight(90);
    zofka.move((velikostPismen*2)/3);
    zofka.turnRight(180);
  }

}
