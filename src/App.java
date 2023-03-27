import java.util.List;
import java.util.Scanner;

import controller.ListHolidays;
import model.Holiday;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a data que gostaria de pesquisar: ");
        String date = scan.nextLine();
        scan.close();
        checkHoliday(date);
    }

    public static void checkHoliday(String date) {

        List<Holiday> holidays = ListHolidays.getList();
        for (int i = 0; i < holidays.size(); i++) {
            if (holidays.get(i).getDate().equals(date)) {
                System.out.println("Este é o feriado de " + holidays.get(i).getName());
                return;
            }
        }
        System.out.println("Este feriado não existe!!");
    }
}
