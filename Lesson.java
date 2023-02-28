import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите роль: ");
        String role = scanner.nextLine();
        System.out.println("Введите пароль");
        String pass = scanner.nextLine();
        if(role.equals("Admin") && pass.equals("12345")) {
            System.out.println("Все пользователи");
        } else {
            System.out.println("Как Вас зовут?");
            String name = scanner.nextLine();
        }
    }
}
