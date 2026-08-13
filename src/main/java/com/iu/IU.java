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

    public int readNumberOfPlayers(int minPlayers, int maxPlayers){
        int numberOfPlayers;

        do{
            numberOfPlayers = readNumber("Introduce el numero de jugadores a jugar ("  + minPlayers + " - " + maxPlayers + "): ");

            if(numberOfPlayers < minPlayers || numberOfPlayers > maxPlayers){
                displayMessage("El numero de jugadores a jugar debe de estar entre " + minPlayers + " y " + maxPlayers + ", por favor, introduzca un numero correcto.");
            }
        }while(numberOfPlayers < minPlayers || numberOfPlayers > maxPlayers);

        return numberOfPlayers;
    }

    public String readPlayerName(){
        String playerName;

        do{
            playerName = readString("Introduce el nombre del jugador: ");

            if(playerName.isEmpty()){
                displayMessage("El nombre introducido no es válido, por favor, introduzca un nombre correcto.");
            }
        }while(playerName.isEmpty());

        return playerName;
    }

    public int readOptionToPlay(){
        int option;

        do{
            option = readNumber("Elige una opcion: (Double | Hit | Stand) --> (1 | 2 | 3): ");

            if(option < 1 || option > 3){
                displayMessage("La opcion elegida es invalida, por favor, eliga una opcion valida (1 - 3).");
            }
        }while(option < 1 || option > 3);

        return option;
    }

    public void displayLimitValuePassed(){
        displayMessage("Tu puntuacion ha superado 21, has perdido.");
    }
}