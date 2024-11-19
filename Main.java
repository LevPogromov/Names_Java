import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое ФИО");
        String fio = sc.nextLine();
        System.out.println("Введите свою дату рождения в виде число-месяц-год");
        String date = sc.nextLine();

        String[] full_name = fio.split(" ");
        System.out.println(full_name[0] + " " + full_name[1].toCharArray()[0] + "."
                + full_name[2].toCharArray()[0] + ".");
        if (full_name[2].toCharArray()[full_name[2].length()-1] == 'ч' &&
        full_name[2].toCharArray()[full_name[2].length()-2] == 'и'){
            System.out.println("Пол: мужской");
        }
        else if (full_name[2].toCharArray()[full_name[2].length()-1] == 'а' &&
                full_name[2].toCharArray()[full_name[2].length()-2] == 'н'){
            System.out.println("Пол: женский");
        }
        else {
            System.out.println("Пол не определен");
        }
        LocalDate currentDate = LocalDate.now();
        String curr_string_date = currentDate.toString();
        String[] curr_arr_date = curr_string_date.split("-");
        String[] date_arr = date.split("-");
        int age = Integer.parseInt(curr_arr_date[0]) - Integer.parseInt(date_arr[2]);
        if (Integer.parseInt(curr_arr_date[1]) < Integer.parseInt(date_arr[1])) {
            age -= 1;
        }
        else if (Integer.parseInt(curr_arr_date[1]) == Integer.parseInt(date_arr[1])) {
            if (Integer.parseInt(curr_arr_date[2]) < Integer.parseInt(date_arr[0])){
                age -= 1;
            }
        }
        if (age % 100 >= 11 && age % 100 <= 20 || age % 10 == 0 || age % 10 >= 5){
            System.out.println(age + " лет");
        }
        else if (age % 10 == 1){
            System.out.println(age + " год");
        }
        else if (age % 10 > 1 && age % 10 < 5){
            System.out.println(age + " года");
        }
    }
}