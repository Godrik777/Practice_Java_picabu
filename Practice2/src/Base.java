public class Base {
    public static void main(String[] args) {
        // Домашка
        // Базовый уровень
        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        //
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "a ");
        }
        System.out.println('\n');

        // Задание №2
        // Дано:
        int ageChildren = 18;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
        //
        if (ageChildren < 6) {
            System.out.println("Ребенку " + ageChildren + " и он идет в детский сад");
        } else if (ageChildren < 11) {
            System.out.println("Ребенку " + ageChildren + " и он идет в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("Ребенку " + ageChildren + " и он идет в среднюю школу");
        } else {
            System.out.println("Ребенку " + ageChildren + " и он идет в университет");
        }
        System.out.println();

        // Задание №3
        // Дано:
        boolean chicken = true;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = false;
        boolean sausage = true;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.

        if (chicken && vegetables && sour && toast) {
            System.out.println("Цезарь");
        } else if (vegetables && sausage && chicken && eggs) {
            System.out.println("Оливье");
        } else if (vegetables) {
            System.out.println("Овощной");
        } else {
            System.out.println("Недостаточно ингридиентов");
        }
        System.out.println();
        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.

        Cat masha = new Cat("Masha", 3);
        Dog jack = new Dog("Jack", 15);

        masha.voice();
        jack.voice();
        System.out.println();

        System.out.println(jack.name);
        jack.setName("Kek");
        String name = jack.getName();
        System.out.println(name);
        jack.setName("Puke");
        name = jack.getName();
        System.out.println(name + '\n');

        System.out.println(masha.name);
        masha.setName("Lysi");
        name = masha.getName();
        System.out.println(name);

    }
}