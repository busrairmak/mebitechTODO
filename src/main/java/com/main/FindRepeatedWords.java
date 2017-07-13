package com.main;

/**
 * Hello world!
 */
public class FindRepeatedWords {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] kelime = {"pie", "apple", "red", "pie", "red", "red", "apple", "milk"};
        String[] word = new String[kelime.length];
        tekrar(kelime, word);
    }

    public static void tekrar(String[] kelime, String[] word) {
        int sayac = 0;
        int control = 1;
        // System.out.println(word.length);
        for (int j = 0; j < word.length; j++) {

            word[j] = kelime[j];
            //System.out.println(word[j]);
            for (int k = 0; k < j; k++) {

                if (word[k].equals(word[j])) {
                    control = 0;
                }


            }


            if (control != 0) {

                for (int i = 0; i < kelime.length; i++) {
                    if (word[j].equals(kelime[i]))
                        sayac++;
                }

                if (sayac != 1)
                    System.out.println(word[j] + " " + sayac + "  kere tekrar etmistir.");
                else
                    System.out.println(word[j] + " 1 tane vardır");

                sayac = 0;
            }

            control = 1;

        }
    }

}



