package ru.mirea.ikbo1319.task26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Map<String, String> fullNames = new HashMap<>();

        fullNames.put("фамилия", "имя");

        for (int i = 0; i < 6; i++) {
            fullNames.put("фамилия" + i, "имя" + i);
        }

        fullNames.put("фамилия6", "имя6");
        fullNames.put("фамилия7", "имя"); // добавление повторяющегося имени
        fullNames.put("фамилия8", "имя6"); // добавление повторяющегося имени

        HashMap<String, Integer> counters = new HashMap<>();

        // подсчёт, какой ключ сколько раз встречается
        for (String key : fullNames.keySet()) {
            if (counters.isEmpty()) {
                counters.put(fullNames.get(key), 1);
            } else {
                if (counters.containsKey(fullNames.get(key))) {
                    counters.put(fullNames.get(key), counters.get(fullNames.get(key)) + 1);
                } else {
                    counters.put(fullNames.get(key), 1);
                }
            }
        }

        // удаление элемента, если ключ встречается больше одного раза
        fullNames.entrySet().removeIf(entry -> counters.get(fullNames.get(entry.getKey())) > 1);

        // вывод ключей и соответствующих значений
        for (String key : fullNames.keySet()) {
            System.out.println("key: " + key + " value: " + fullNames.get(key));
        }

        System.out.println("Пункт 2");

        Map<String, ArrayList<String>> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько нужно добавить городов ?");

        for (int i = scanner.nextInt(); i > 0; i--) {
            City city = new City(scanner.next(), scanner.next());
            if (!map.containsKey(city.getCountry())) {
                map.put(city.getCountry(), new ArrayList<>());
            }
            map.get(city.getCountry()).add(city.getCity());
        }

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key).toString());
        }
    }
}
