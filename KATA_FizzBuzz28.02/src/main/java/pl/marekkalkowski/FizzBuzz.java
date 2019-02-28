package pl.marekkalkowski;

public class FizzBuzz {

    private int number;

    public String fizzBuzzKata(int number) {

        if (number < 0) {
            return "Liczba powinna byc wieksza od zera";
        } else if (number == 0) {
            return String.valueOf(number);
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
