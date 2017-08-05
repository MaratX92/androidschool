import java.util.Random;
import java.util.Scanner;



public class Game {
    public static void main(String[] args) {
        System.out.println("Угадайте загаданное число! От 1 до 100!");
        System.out.print("Введите число: ");
        int number = new Random().nextInt(100) + 1; // случайное число от 1 до 100
        Scanner in = new Scanner(System.in);
        int guess;

        do {
            guess = in.nextInt(); // число, прочитанное с клавиатуры
            if (number == guess) {
                System.out.println("молодец, угадал!");
            } else if (number > guess) {
                System.out.println("Нет, больше!");
            } else {
                System.out.println("Нет, меньше!");
            }
        }
        while (guess != number);
        System.out.println("До свидания!");
    }
}