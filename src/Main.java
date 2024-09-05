import java.util.Random;

public class Main {

    // Метод для определения, можно ли идти гулять
    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    // Метод для генерации случайного возраста
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);  // Возвращает случайный возраст от 0 до 99
    }

    public static void main(String[] args) {
        // Вызов метода permission с случайным возрастом и разной температурой
        System.out.println("Возраст: " + generateRandomAge() + ", Результат: " + permission(generateRandomAge(), 11));
        System.out.println("Возраст: " + generateRandomAge() + ", Результат: " + permission(generateRandomAge(), -15));
        System.out.println("Возраст: " + generateRandomAge() + ", Результат: " + permission(generateRandomAge(), 35));
        System.out.println("Возраст: " + generateRandomAge() + ", Результат: " + permission(generateRandomAge(), 20));
        System.out.println("Возраст: " + generateRandomAge() + ", Результат: " + permission(generateRandomAge(), -5));
    }
}
