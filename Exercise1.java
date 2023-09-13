// Пусть дан LinkedList с несколькими элементами.
// Напишите класс LLTasks с методом revert, который 
// принимал бы на вход LinkedList и возвращает “перевернутый” список.

// // Дан 
// [1, One, 2, Two]

// // Вывод
// [1, One, 2, Two]
// [Two, 2, One, 1]

import java.util.LinkedList;

class Exercise1 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        System.out.println(ll);
        LinkedList<Object> llReverted = new LinkedList<>(LLTasks.revert(ll));
        System.out.println(llReverted);
        
    }
}

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> llReverted = new LinkedList<>();
        for (int i = 0; i < ll.size(); i++) {
            llReverted.addFirst(ll.get(i));
        }
        return llReverted;
    }
}