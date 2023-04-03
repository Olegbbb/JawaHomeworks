
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;

public class Task_1 {

    public static LinkedList<String> revers(LinkedList<String> someList) {
        LinkedList<String> result = new LinkedList<>();
        for (int i = someList.size() - 1 ; i >= 0; i--) {
            result.add(someList.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        LinkedList<String> mainList = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            String b = Integer.toString(i);
            mainList.add(b);
        }
        System.out.println(mainList);
        System.out.println(revers(mainList));
    }
}
