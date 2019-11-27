package sda.krk24.zajecia2.time;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        Object obj = new Scanner(System.in);
        Scanner sc = (Scanner)obj;
        String peselString = "123445";

        Validatable valid = new Pesel(new String("123445"));
        valid = new Pesel(peselString);
        Person p = new Person();
        System.out.println(p.name + " " + p.surname + " " + p.age);
        if(next != null){
            String pesel = next;
            Pesel peselValidator = new Pesel(pesel);
            System.out.println(peselValidator.getPesel() + " : " + peselValidator.isValid());
        }

    }
//76061978118
}
