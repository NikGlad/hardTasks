import java.io.*;
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


//public class Main {
//
//    public static void main(String[] args) {
//        TreeMap<Integer, String> map = new TreeMap<>();
//
//        map.put(0, "Newbie");
//        map.put(200, "Trainee");
//        map.put(800, "Junior");
//        map.put(1200, "Strong Junior");
//        map.put(2700, "Middle");
//        map.put(3500, "Strong Middle");
//        map.put(5000, "Senior");
//
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            int salary = random.nextInt(7000);
//            String position = getJobTitle(map, salary);
//            System.out.printf("Зарплате $%d соответствует позиция %s%n", salary, position);
//        }
//    }
//
//    public static String getJobTitle(TreeMap<Integer, String> map, Integer salary) {
//        return map.floorEntry(salary).getValue();
//    }
//}

/*
Изучаем методы класса Collections, часть 1

В классе Solution объявлены методы: copy(ArrayList<String>, ArrayList<String>), addAll(ArrayList<String>, String...),
replaceAll(ArrayList<String>, String, String). Тебе нужно переписать их реализацию,
используя при этом только соответствующие методы класса Collections. Параметр String... означает то же, что и String[],
только аргументы String можно передавать через запятую.
*/

//public class Main {
//
//    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
//        Collections.copy(destination, source);
//    }
//
//    public static void addAll(ArrayList<String> list, String... strings) {
//        Collections.addAll(list, strings);
//    }
//
//    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
//        Collections.replaceAll(list, oldValue, newValue);
//    }
//}

//class Main{
//    public static void main(String[] args) {
//        System.out.println("hello");
//    }
//}

/*
Потоки
Перепутанные байты
Напиши программу, которая считывает из консоли путь к файлу1 и путь к файлу2.
Далее все байты из файла1 записывает в файл2,
но при этом меняет их местами по такому принципу: первый со вторым, третий с четвертым и т. д.
Если последний байт в файле1 нечетный, пишем его в файл2 как есть.
Для чтения и записи файлов используй FileInputStream и FileOutputStream.
*/

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fis = new FileInputStream(scanner.nextLine());
             FileOutputStream fos = new FileOutputStream(scanner.nextLine())) {
            byte[] bytesIn = fis.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];
            for (int i = 0; i < bytesIn.length; i += 2) {
                if (i < bytesIn.length - 1) {
                    bytesOut[i] = bytesIn[i + 1];
                    bytesOut[i + 1] = bytesIn[i];
                } else {
                    bytesOut[i] = bytesIn[i];
                }
            }
            fos.write(bytesOut);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}