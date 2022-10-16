import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию или введите 'end' для завершения:");
            System.out.println("\t 1. Добавить");
            System.out.println("\t 2. Показать");
            System.out.println("\t 3. Удалить");
            System.out.println("\t 4. Найти");
            String input = scan.nextLine();

            if (input.equals("end")) {
                break;
            }
            int operation = Integer.parseInt(input);
            if (operation == 1) {
                System.out.println("Что вы хотите добавить?");
                String subOperation = scan.nextLine();
                list.add(subOperation);
                System.out.println("Итого в списке покупок: " + list.size());

            } else if (operation == 2) {
                System.out.println("Список покупок:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("\t" + (i + 1) + ". " + list.get(i));
                }

            } else if (operation == 3) {
                System.out.println("Введите № покупки или название, чтобы удалить");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("\t" + (i + 1) + ". " + list.get(i));
                }
                input = scan.nextLine();
                try {
                    int number = Integer.parseInt(input) - 1;
                    System.out.println("Удалено из списка: " + list.get(number));
                    list.remove(number);
                } catch (NumberFormatException e) {
                    if (list.contains(input)) {
                        System.out.println("Удалено из списка: " + input);
                    }
                }
            } else if (operation == 4) {
                System.out.println("Введите ключевое слово для поиска:");
                input = scan.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    String result = list.get(i);
                    if (result.toLowerCase().contains(input.toLowerCase())) {
                        System.out.println((i + 1) + ". " + result);
                    }
                }
            } else {
                System.out.println("Такой операции нет");
            }
        }
    }
}