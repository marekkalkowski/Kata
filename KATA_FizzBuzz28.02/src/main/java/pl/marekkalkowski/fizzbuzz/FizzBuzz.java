package pl.marekkalkowski.fizzbuzz;

public class FizzBuzz {

    private int number;

    public String fizzBuzzKata(int number) {

        String result = "";
        if (number < 0) {
            return "Liczba powinna byc wieksza od zera";
        }

        if (number % 3 == 0) {
            result += "Fizz";
        }

        if (number % 5 == 0) {
            result += "Buzz";
        }

        if (number == 0 || (number % 3 != 0 && number % 5 != 0)) {
            result = String.valueOf(number);
        }

        return result;
    }
}
