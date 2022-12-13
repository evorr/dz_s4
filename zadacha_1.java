// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class zadacha_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 9; i++) {   // заполнили список
            ll.add(i);
        }
        System.out.println(ll);

        for (int i = 0; i < ll.size() / 2; i++) {
            int temp = ll.get(i);
            ll.set(i,ll.get(ll.size() - 1 - i));
            ll.set(ll.size() - 1 - i, temp);
        }
        System.out.println(ll);
    }
}
