package lesson15homework;



import java.util.*;

public class MapTask {
    public static void main(String[] args) {
        // FIXME:: В решениях не использовать lambda выражения и stream API

        // TODO:: написать статический метод, который принимает на вход мапу (firstTaskMap) и город (city),
        //  формирует и возвращает список (List) логинов, которые соответствуют переданному городу


        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";

        loginToList(firstTaskMap, city);
        System.out.println(MapTask.loginList + "\n");


        // TODO:: дан список слов (words).
        //  Написать статический метод, который будет возвращать количество одинаковых слов
        //  в мапе вида Map<String, Integer>, где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        MapTask.repeatWords(words);
        System.out.println(MapTask.words + "\n");


        // TODO:: дана мапа (customerMap).
        //  Написать статический метод, который принимает на вход аргументы int from и int to и возвращает
        //  новую мапу, в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));

        MapTask.separateAge(30, 70, customerMap);
        System.out.println(ageSeparatedCustomers + "\n");

        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод (можно статический):
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
        //  (Map<String, Long>, где - ключи (String) - слово, значения (Long) - частота встречаемости)
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  (Map<Integer, ArrayList<String>>, где - ключи (Integer) - количество букв, значения (ArrayList<String>) - слова)
        //  3. написать метод, который выводит в консоль топ 10 самых часто встречаемых в тексте слов (артикли и предлоги тоже считаем за слова)

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";


        System.out.println(getAmountWords(text, "still")); // Вывод результата метода 1

        showGroupWords(text);  // Вывод результата метода 2

        printTopMeetWords(text); // Вывод результата метода 3

    }

    // Задача 1:
    static List<String> loginList = new ArrayList<>();     // выбор ArrayList обусловлен тем, что коллекция в данном конкретном случае пополняется единожды,

    // добавление в середину массива под капотом коллекции не требуется
    public static void loginToList(Map<String, String> map, String city) {
        for (Map.Entry<String, String> m : map.entrySet()) {
            if (m.getValue().equals(city)) {
                loginList.add(m.getKey());
            }
        }
    }

    // Задача 2:
    static HashMap<String, Integer> words = new HashMap<>();

    public static void repeatWords(List<String> list) {
        for (String s : list) {
            if (words.containsKey(s)) {
                words.put(s, words.get(s) + 1);
            } else {
                words.put(s, 1);
            }
        }
    }


    // Задача 3:
    static HashMap<String, Customer> ageSeparatedCustomers = new HashMap<>();

    public static void separateAge(int from, int to, Map<String, Customer> map) {
        if (from != 0 && to != 0) {
            for (Map.Entry<String, Customer> m : map.entrySet()) {
                if (m.getValue().getAge() >= from && m.getValue().getAge() <= to) {
                    ageSeparatedCustomers.put(m.getKey(), m.getValue());
                }
            }
        }
    }


    // Задача 4:

    //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
    //  (Map<String, Long>, где - ключи (String) - слово, значения (Long) - частота встречаемости)
    public static Long getAmountWords(String text, String word) {
        Map<String, Long> wordsHashMap = new HashMap<>();
        String[] wordsFromText = text.split(" ");

        for (String s : wordsFromText) {
            if (wordsHashMap.containsKey(s)) {
                wordsHashMap.put(s, wordsHashMap.get(s) + 1);
            } else {
                wordsHashMap.put(s, 1L);
            }
        }
        System.out.print("The word '" + word + "' meets in the text times: ");
        return wordsHashMap.get(word);
    }

    //  2. написать метод, который собирает все слова в группы по количеству букв:
    //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
    //  (Map<Integer, ArrayList<String>>, где - ключи (Integer) - количество букв, значения (ArrayList<String>) - слова)
    //TODO:: Плохо понимаю задачу. Если в мапе значение - ArrayList<String>, при этом мапа не принимает
    // аргументом элементы ArrayList т.к. это всё же String, а не сам ArrayList<>. Получается, для каждого
    // ключа надо создавать новую коллекцию ArrayList<>? Или это решается как-то по-другому?
    // Пока оставлю как есть с value String ...

    public static void showGroupWords(String text) {
        List<String> setWords = new ArrayList<>();
        setWords = List.of(text.split(" "));
        Map<Integer, String> collectWords = new HashMap<>();

        for (String s : setWords) {
            if (collectWords.containsKey(s.length())) {
                collectWords.put(s.length(), collectWords.get(s.length()) + ", " + s);
            } else {
                collectWords.put(s.length(), " " + s);
            }
        }
        System.out.println("\n" + collectWords + "\n");
    }

    //  3. написать метод, который выводит в консоль топ 10 самых часто встречаемых в тексте слов (артикли и предлоги тоже считаем за слова)
    //  Наверно это индийский код=) Подсмотрел более изящное решение с LinkedHashMap, но пушить чужое решение не хочется,
    //  пусть будет моё
    public static void printTopMeetWords(String text) {
        String[] wordsFromText = text.split(" ");
        Map<String, Integer> collectWords = new HashMap<>();
        int iterationCounter = 0;
        int maxWords = 0;

        for (String s : wordsFromText) {
            if (collectWords.containsKey(s)) {
                collectWords.replace(s, collectWords.get(s) + 1);
            } else {
                collectWords.put(s, 1);
            }
        }

        for (Map.Entry<String, Integer> m : collectWords.entrySet()) {
            if (m.getValue() > maxWords) {
                maxWords = m.getValue();
            }
        }

        while (true) {
            for (Map.Entry<String, Integer> m : collectWords.entrySet()) {
                if (iterationCounter == 10) return;
                if (m.getValue() == maxWords) {
                    iterationCounter++;
                    System.out.println("Result " + iterationCounter + ": " + m);
                }
            }
            maxWords--;
        }
    }

}
