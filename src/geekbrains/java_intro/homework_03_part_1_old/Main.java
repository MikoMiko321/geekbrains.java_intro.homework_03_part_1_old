package geekbrains.java_intro.homework_03_part_1_old;

import java.util.Scanner;

public class Main {
//1. Написать программу, которая загадывает случайное число от 0 до 9,
// и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


    public static void main(String[] args) {
        final int MAX_NUMBER = 9;
        final int NUMBER_OF_TRIES = 3;
        int myGuess;
        int myAnswer;
        Scanner myScanner = new Scanner(System.in);

        do{
            int selectedRandomNumber=(int)Math.round(Math.random()*MAX_NUMBER);
            //System.out.println(selectedRandomNumber); // Test spoiler
            System.out.println("Попробуйте угадать число от 0 до "+ MAX_NUMBER);
            for(int i=NUMBER_OF_TRIES;i>0;i--){
                System.out.println("Попыток осталось: "+i);
                myGuess=myScanner.nextInt();
                if(myGuess==selectedRandomNumber){
                    System.out.println("Вы угадали!");
                    break;
                }
                if(myGuess>selectedRandomNumber){
                    System.out.println("Неверно, загаданное число меньше предложенного Вами!");
                }
                if(myGuess<selectedRandomNumber){
                    System.out.println("Неверно, загаданное число больше предложенного Вами!");
                }
            }
            System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»");
            myAnswer=myScanner.nextInt();
        }while (myAnswer==1);
    }
}


