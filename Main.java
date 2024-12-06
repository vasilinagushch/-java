// Main.java
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("ru", "RU")); // Установить локаль на русскую
        new Random().setSeed(System.currentTimeMillis()); // Инициализация генератора случайных чисел

        Game game = new Game();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя (используя английские символы): ");
        String name = scanner.nextLine();
        game.setPlayerName(name);
        game.initializePuzzles();
        game.initializePhrases();
        game.startGame();
        scanner.close();
    }
}