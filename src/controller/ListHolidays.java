package controller;

import java.util.ArrayList;
import java.util.List;
import model.Holiday;

public class ListHolidays {

  public static List<Holiday> getList() {
    List<Holiday> holidays = new ArrayList<Holiday>();

    holidays.add(new Holiday("01/01/2023", "Confraternização mundial"));
    holidays.add(new Holiday("21/02/2023", "Carnaval"));
    holidays.add(new Holiday("17/04/2023", "Páscoa"));
    holidays.add(new Holiday("21/04/2023", "Tiradentes"));
    holidays.add(new Holiday("01/05/2023", "Dia do trabalho"));
    holidays.add(new Holiday("08/06/2023", "Corpus Christi"));
    holidays.add(new Holiday("07/09/2023", "Independência do Brasil"));
    holidays.add(new Holiday("07/09/2023", "Independência do Brasil"));
    holidays.add(new Holiday("02/11/2023", "Finados"));
    holidays.add(new Holiday("15/11/2023", "Proclamação da República"));
    holidays.add(new Holiday("25/12/2023", "Natal"));

    return holidays;
  }

}
