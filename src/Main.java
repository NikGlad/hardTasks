import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.*;

import java.util.TreeMap;

//import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import static java.util.Arrays.asList;

/*
Зарплаты и позиции

Метод getJobTitle получает в качестве параметра TreeMap,
в которой значение это должность, а ключ — минимальная зарплата для соответствующей должности.
Метод должен вернуть должность (значение в TreeMap), которая соответствует зарплате переданной вторым параметром в getJobTitle.
Например, если передать в метод getJobTitle(map, 300), или getJobTitle(map, 400) или getJobTitle(map, 799),
то должна вернуться строка "Trainee". А если передать getJobTitle(map, 900) — строка "Junior".
С учетом того, что TreeMap реализует интерфейс NavigableMap, эту задачу можно решить, используя метод/ы из данного интерфейса.
 */


public class Main {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(0, "Newbie");
        map.put(200, "Trainee");
        map.put(800, "Junior");
        map.put(1200, "Strong Junior");
        map.put(2700, "Middle");
        map.put(3500, "Strong Middle");
        map.put(5000, "Senior");

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int salary = random.nextInt(7000);
            String position = getJobTitle(map, salary);
            System.out.printf("Зарплате $%d соответствует позиция %s%n", salary, position);
        }
    }

    public static String getJobTitle(TreeMap<Integer, String> map, Integer salary) {
        return map.floorEntry(salary).getValue();
    }
}

