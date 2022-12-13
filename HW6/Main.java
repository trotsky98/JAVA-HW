package HW6;


import java.util.*;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
public class Main {
    public static void main(String[] args) {

        List<Notebook> notebooks = Arrays.asList(
                new Notebook(12, 2000, "windows10", "red"),
                new Notebook(8, 1000, "Mac OS", "white"),
                new Notebook(16, 500, "debian", "black"),
                new Notebook(32, 500, "ubuntu", "blue"));

        filter(notebooks);
    }
    public static void filter(List<Notebook> notebooks) {
        System.out.println("ноутбуки с оперативной памятью от:");
        Scanner sc = new Scanner(System.in);
        Integer ram = Integer.valueOf(sc.nextLine());
        System.out.println("ноутбуки с жестким диском от:");
        Integer hdd = Integer.valueOf(sc.nextLine());
        for (var i : notebooks) {
            if(i.getRam()>=ram && i.getHdd()>=hdd)
            System.out.println(i);
        }
    }
}