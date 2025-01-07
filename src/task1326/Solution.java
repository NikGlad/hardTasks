package task1326;

import java.util.Queue;

/*
В очередь!

Напишем простую реализацию очереди.

Класс MyQueue наследует AbstractQueue<String>, тебе нужно реализовать 5 методов.
Значения будут храниться в списке values.
Элементы, которые должны добавляться в хвост очереди,
будут добавляться в конец values.
Элемент с индексом 0 в values будет считаться головой очереди.
 */
public class Solution {

    public static void main(String[] args) {
        Queue<String> queue = new MyQueue();

        for (int i = 0; i < 10; i++) {
            queue.offer("элемент " + i);
        }
        System.out.println("длина очереди: " + queue.size());

        System.out.println("*** iterator ***");
        for (Object o : queue) {
            System.out.println(o);
        }

        System.out.println("*** peek ***");
        for (int i = 0; i < 12; i++) {
            System.out.println(queue.peek());
        }

        System.out.println("*** poll ***");
        for (int i = 0; i < 12; i++) {
            System.out.println(queue.poll());
        }

        System.out.println("длина очереди: " + queue.size());
    }
}
