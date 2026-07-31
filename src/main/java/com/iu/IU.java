package com.iu;

import java.util.Scanner;

public class IU {
    private final Scanner keyboard;

    public IU(){
        keyboard = new Scanner(System.in);
    }

    private int readNumber(String msg){
        boolean repeat;
        int toret = 0;

        do{
            repeat = false;
            System.out.println(msg);
            try{
                toret = Integer.parseInt(keyboard.nextLine());
            }catch(NumberFormatException exc){
                repeat = true;
            }
        }while(repeat);

        return toret;
    }

    private String readString(String msg){
        System.out.println(msg);
        return keyboard.nextLine();
    }

    private void displayMessage(String msg){
        System.out.println(msg);
    }
}