package sda.krk24.zajecia1.exception;

import java.io.File;
import java.io.FileNotFoundException;

public class ParseExceptionTest {
    public static void main(String[] args) {
        String[] tries = {"Ab1234", "1234AB", "12345", "1321DAS"};
        int correct = 0;
        for(String str : tries){
            try {
                correct = Integer.parseInt(str);
                System.out.println("odczytano wartosc: " + correct);
                new File("asdadw").createNewFile();
            } catch(NumberFormatException e){
//                e.printStackTrace();
                System.out.println("Niepoprawne dane, sprobuj ponownie " + e.getMessage());
            } catch(FileNotFoundException e){

            } catch(Exception e){

            }
        }
    }
}
