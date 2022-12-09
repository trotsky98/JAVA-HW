package HW4;
/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue()- возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String[] arr = {"4","8","15","16","23", "42"};
        LinkedList<String> lin = new LinkedList<>(Arrays.asList(arr));
        enqueue(lin);
        dequeue(lin);
        first(lin);
    }

    public static LinkedList<String> enqueue(LinkedList<String> lin) {
        System.out.print(lin + "\nчто добавить в список: ");
        Scanner sc = new Scanner(System.in);
        lin.add(sc.nextLine());
        System.out.println(lin);;
        return lin;
    }

    public static LinkedList<String> dequeue(LinkedList<String> lin){
        System.out.println("Удален первый элимент: " + lin.removeFirst());
        System.out.println("Получим: " + lin);
        return lin;
    }

    public static LinkedList<String> first(LinkedList<String> lin){
        System.out.print("Теперь первым элиментом является: " + lin.element());
        return lin;
    }

}