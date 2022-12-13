// Реализуйте очередь с помощью LinkedList со следующими методами:
//- enqueue() - помещает элемент в конец очереди,
//- dequeue() - возвращает первый элемент из очереди и удаляет его,
//- first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class zadacha_2 {
    private static void enqueue(int elem, LinkedList<Integer> list) {
        list.addLast(elem);
    }
    private static int dequeue(LinkedList<Integer> list) {
        return list.removeFirst();
    }
    private static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }

    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 9; i++) {   // заполнили список
            ll.add(i);
        }
        System.out.println(ll);
        enqueue(3,ll);
        System.out.println(dequeue(ll));
        System.out.println(first(ll));
        System.out.println(ll);

    }
}
