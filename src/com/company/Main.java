package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*Дана  map <Character, Integer>.
        Необходимо сформировать случайную строку, где соответствующая буква будет встречаться заданное количество  раз.*/
        //{A->2, b->1, k->2, c->3, ‘ ‘->2 } -> “ck cca k”

        Map<String,Integer> map = new HashMap<>();
        map.put("A",2);
        map.put("B",1);
        map.put("C",3);
        map.put("D",4);

        List<String> Rez = new ArrayList<>();

        for (Map.Entry e: map.entrySet()) {
            int kvo = (int) e.getValue();
            for (int i=1; i<=kvo; i++) {
                Rez.add(String.valueOf(e.getKey()));
            }
        }

        Collections.shuffle(Rez);

        for (String r:Rez) {
            System.out.println(r);
        }

    }
}
