package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        //Ćwiczenie ze slajdu 16, 19 i 27
        Menu sth = new Menu(1, "text");
        System.out.println(sth.getNumber());
        System.out.println(sth.getText());

        //Ćwiczenie ze slajdu 23
        System.out.println(sth.format());
        sth.klasa();

        //Ćwiczenie ze slajdu 34
        System.out.println(sth.getVarInt());
        System.out.println(sth.getVarInteger());

        //Ćwiczenie ze slajdu 36
        System.out.println(sth.getCar());

        //Ćwiczenie ze slajdu 47 i 49 (nie wiem czemu podkreśla mi zduplikowany kod mimo, że dotyczy on różnych obiektów)
        Menu menu1 = new Menu();
        Menu menu2 = new Menu();
        menu1.setNumber(1);
        menu2.setNumber(2);

        switch (menu1.getNumber()) {
            case 1:
                menu1.setCar(Brand.POLONEZ);
                break;
            case 2:
                menu1.setCar(Brand.SYRENKA);
                break;
        }

        switch (menu2.getNumber()) {
            case 1:
                menu2.setCar(Brand.POLONEZ);
                break;
            case 2:
                menu2.setCar(Brand.SYRENKA);
                break;
        }
        System.out.println(menu1.getCar());
        System.out.println(menu2.getCar());

        //Ćwiczenie ze slajdu 55
        OddNumbers(12);

        //Ćwiczenie ze slajdu 58
        Scanner input = new Scanner(System.in);
        sth.setNumber1(input.nextDouble());
        sth.setNumber2(input.nextDouble());
        System.out.println(sth.getNumber1() + sth.getNumber2());

        //Ćwiczenie ze slajdu 59
        System.out.println("Dostępne opcje:");
        for(int qtt=0; qtt<Options.values().length; qtt++) {
            System.out.println(Options.values()[qtt]);
        }

        System.out.println("Wybierz opcje (1-4)");
        while (input.hasNextLine()) {
            if(input.hasNextInt()){
                sth.setNumber(input.nextInt());
              if (sth.getNumber() == 0) {
                    break;
               }
              if (sth.getNumber() < 5) {
                  System.out.println("Wybraleś " + Options.values()[sth.getNumber() - 1]);
                 break;
                } else {
                 System.out.println("Podaj mniejszą liczbę (1-4)");
               }
            }
            else {
                System.out.println("To nie jest liczba. Podaj liczbę 1-4");
                input.next();
            }
        }

        //Ćwiczenie ze slajdu 65
        if(sth.getTextA() == sth.getTextB()){
            System.out.println("warunek == prawdziwy");
        }
        if(sth.getTextA().equals(sth.getTextB())){
            System.out.println("warunek equals prawdziwy");
        }
        System.out.println(sth.getTextA().hashCode());
        System.out.println(sth.getTextB().hashCode());


    }

    //Metoda do ćwiczenia ze slajdu 55
    public static void OddNumbers(int numb1){
        for(int numb2=0; numb2<=numb1; numb2++){
            if(numb2 % 11 == 0 && numb2 != 0){
                break;
            }
            else if(numb2 % 2 == 1){
                System.out.println(numb2);
            }
        }
    }

}
