package HW5;
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Task0 {
    public static void main (String[] args) {
        String[] str = {"Смит 55599", "Андерсен 99999", "Морфеус 25698", "Тринити 54321", "Пелевин 77777"};
        ArrayList <String> subscribers = new ArrayList<>(Arrays.asList(str));
        HashMap <String, ArrayList<Integer>> telephone = new HashMap<>();
        for (int i = 0; i < subscribers.size(); i++) {
            String[] subscriber = subscribers.get(i).split(" ");
            String key = subscriber[0];
            int value = Integer.parseInt(subscriber[1]);
            ArrayList <Integer> number = new ArrayList<>();
            number.add(value);
            if (telephone.containsKey(key)) {
                number.add(value);
                telephone.put(key, number);
            } else {
                telephone.put(key, number);
            }
        }
        System.out.println(telephone);
    }
}