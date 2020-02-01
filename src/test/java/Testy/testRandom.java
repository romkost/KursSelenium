package Testy;
import java.util.Random;

public class testRandom {


    public static void main(String[] args) {
        Random random = new Random();
        int randomInteger = random.nextInt(50);
        String[] products = {"T-shirt", "Mug", "Sweater", "Cushion", "Poster", "Notebook"};

        String[] firstnameFemale = {"Asia", "Kasia", "Basia", "Ala", "Ela", "Mela", "Henia", "Genia"};
        String[] firstnameMale = {"Wiesiek", "Grzesiek", "Krzysiek", "Tytus", "Romek", "Tomek"};

        int gender;
        int selectFirstName;


        int rfnFemale = random.nextInt(23);
        int rfnMale = random.nextInt(47);

        if (rfnFemale > rfnMale) {
            selectFirstName = rfnFemale % firstnameFemale.length;
            gender = 2;
        }
        else {
            selectFirstName = rfnMale % firstnameMale.length;
            gender = 1;
        }




        int dzielenie = randomInteger / (products.length-1);

        int productSelector = (dzielenie <=(products.length-1)) ? dzielenie : (dzielenie / 2);

             System.out.println(productSelector);
             System.out.println(randomInteger);
             System.out.println(products.length);
             System.out.println(products[productSelector]);
             System.out.println(dzielenie);

        }











}



