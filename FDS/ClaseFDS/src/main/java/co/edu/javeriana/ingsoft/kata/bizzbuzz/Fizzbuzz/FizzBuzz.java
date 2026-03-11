package co.edu.javeriana.ingsoft.kata.bizzbuzz.Fizzbuzz;

/**
 * Hello world!
 *
 */

public class FizzBuzz {

    public static final Integer MIN_VALUE = 0;
    public static final Integer MAX_VALUE = 100;
    public static final Integer FIZZ_NUMBER = 3;
    public static final Integer BUZZ_NUMBER = 5;
    public static final String FIZZ = "FIZZ";
    public static final String BUZZ = "BUZZ";


    public String calculate(int number){
        if(number < MIN_VALUE || number > MAX_VALUE){
            throw new IllegalArgumentException("El numero debe ser mayor a 0");
        }
        String result = "";
        if(number % FIZZ_NUMBER != 0 && number % BUZZ_NUMBER != 0 ){
            return Integer.toString(number);
        }

        //FIZZ
        if (number % FIZZ_NUMBER == 0)
            return FIZZ;
        //BUZZ
        if(number % BUZZ_NUMBER == 0)
            return BUZZ;

        throw  new RuntimeException("El numero debe ser mayor a 0");





    }


}