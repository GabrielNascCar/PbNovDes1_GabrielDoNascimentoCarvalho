package org.example;

import entities.Adult;
import entities.Child;
import entities.FerrisWheel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FerrisWheel ferrisWheel = new FerrisWheel(); // Creating a new Ferris wheel
        Adult paulo = new Adult("Paulo", 42); // Adult named Paulo
        // Paulo's children
        Child joao = new Child("Joao", 5, paulo); // New child with Paulo as the father
        Child maria = new Child("Maria", 12, paulo); // This is Paulo's daughter
        // Child without defined father
        Child pedro = new Child("Pedro", 13);
        Child henrique = new Child("Henrique", 10);

        ferrisWheel.board(2, paulo);
        ferrisWheel.board(2, pedro);
        ferrisWheel.board(2, maria);
        ferrisWheel.status();

    }
}