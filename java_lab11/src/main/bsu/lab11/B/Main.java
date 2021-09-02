package main.bsu.lab11.B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    /**
     * Задан список целых чисел и некоторое число X. Не используя вспомогательных объектов
     * и методов сортировки и не изменяя размера списка, переставить элементы списка так,
     * чтобы сначала шли числа, не превосходящие X, а затем числа, больше X
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(createDefaultList());
        System.out.println("Первичный список: ");
        System.out.println(list);
        sort(4, list);
        System.out.println("Отсортированный список: ");
        System.out.println(list);
    }

    private static void sort(Integer x, ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = list.size() - 1; j >= 0; j--)
            if (list.get(i) >= x && list.get(j) <= x && i < j) {
                Collections.swap(list, i, j);
            }
        }
    }

    private static List<Integer> createDefaultList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(22);
        list.add(11);
        list.add(6);
        list.add(3);
        list.add(9);
        list.add(16);
        list.add(22);
        return list;
    }
}
