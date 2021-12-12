import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Для регистраций пишите номер и пароль");
            String numPhone = scanner.nextLine();
            list.add(numPhone);
            System.out.println("Теперь осталось пароль");
            String password = scanner.nextLine();
            list.add(password);
            System.out.println("Аккаунт успешно создан");
            System.out.println("Если хотите проверить свой номер,пароль пишите check");
            String value = scanner.nextLine();
            if (value.equalsIgnoreCase("check")) {
                for (String s : list) {
                    System.out.println(s);
                }
            }
        }
    }
}
