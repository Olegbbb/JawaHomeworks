//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Task_2 {

    public static LinkedList enqueue(LinkedList someList, int element){
        someList.add(element);
        return someList;
    }
    public static LinkedList dequeue(LinkedList someList){
        System.out.println("first element: " + someList.getFirst());
        someList.removeFirst();
        return someList;
    }

    public static Object first(LinkedList someList){
        return someList.getFirst();
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList<>();
        for (int i = 1; i < 11; i++) {
            myList.add(i);
        }
        System.out.println(myList.toString());
        System.out.println("enqueue: " + enqueue(myList,33).toString());
        System.out.println("dequeue: " + dequeue(myList).toString());
        System.out.println("first: " + first(myList).toString());
    }
}
