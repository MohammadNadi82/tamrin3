/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamrin4first;

import java.util.*;

public class Tamrin4First {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String Aski = "abcdefghigklmnopqrstuvwxyzDKVQFIBJWPESCXHTMYAUOLRGZN";
        System.out.println("jefgy");
        String LastAnswer = "";
        String change = inp.next();
        for (int i = 0; i < change.length(); i++) {
            for (int j = 0; j < Aski.length(); j++) {
                if (change.charAt(i) == Aski.charAt(j)) {
                    if (change.charAt(i) >= (97) && (122) >= change.charAt(i)) {
                       
                        LastAnswer = LastAnswer + (Aski.charAt(j)-26);
                    } else {
                        LastAnswer = LastAnswer + Aski.charAt(j);
                    }
                }
            }
        }
        System.out.println(LastAnswer);
    }
}