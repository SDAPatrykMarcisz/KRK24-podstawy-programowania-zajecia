package sda.krk24.zajecia3.classes;

public class ZewnetrznaKlasaTest {
    public static void main(String[] args) {
//        ZewnetrznaKlasa klasa = new ZewnetrznaKlasa();
        ZewnetrznaKlasa.WewnetrznaKlasa klasaWewnetrzna
                = new ZewnetrznaKlasa.WewnetrznaKlasa();
    }

    public static void internalMethodClasss(){
        class InternalMethodClass{
            int internal;
        }
        new InternalMethodClass();
    }
}
