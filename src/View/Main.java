/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View;

import Controller.program;
import Model.Candidate;
import java.util.ArrayList;

/**
 *
 * @author hieu9
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<>();

        while (true) {
            int choice = program.menu();
            switch (choice) {
                case 1:
                    program.createCandidate(candidates, 0);
                    break;
                case 2:
                    program.createCandidate(candidates, 1);
                    break;
                case 3:
                    program.createCandidate(candidates, 2);
                    break;
                case 4:
                    program.searchCandidate(candidates);
                    break;
                case 5:
                    return;
            }
        }
    }
}
    
   
    