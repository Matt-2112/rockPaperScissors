package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static String computer(int n) {
        String play = "";
        if(n == 1) {
            play = "Rock";
        } else if(n == 2) {
            play = "Paper";
        } else if(n == 3) {
            play = "Scissors";
        } else {
            return "Error";
        }
        return play;

    }

    public static void game(String playerChoice, String computerChoice) {
        if(playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Rock")) {
            System.out.println("Computer plays rock");
            System.out.println("Tie");
        } else if(playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) {
            System.out.println("Computer plays scissors");
            System.out.println("You win!");
        } else if(playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Paper")) {
            System.out.println("Computer plays paper");
            System.out.println("You lose!");
        } else if(playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Paper")) {
            System.out.println("Computer plays paper");
            System.out.println("Tie");
        } else if(playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")){
            System.out.println("Computer plays rock");
            System.out.println("You win");
        } else if(playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Scissors")){
            System.out.println("Computer plays scissors");
            System.out.println("You lose!");
        } else if(playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Scissors")){
            System.out.println("Computer plays scissors");
            System.out.println("Tie");
        } else if(playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper")){
            System.out.println("Computer plays paper");
            System.out.println("You win!");
        } else if(playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Rock")){
            System.out.println("Computer plays rock");
            System.out.println("You lose!");
        }



    }

    public static void main(String[] args) {

        Random computer = new Random();
        Scanner scanner = new Scanner(System.in);
    System.out.println("Rock, Paper, Scissors?");
    String playerChoice = scanner.nextLine();
        int i = computer.nextInt(4);
        game(playerChoice,computer(i));


    }
}
