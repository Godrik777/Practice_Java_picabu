import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Base {
    public static void main(String[] args) throws IOException {
        //Базовый уровень
        //Задача №1
        //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
        //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
        //Необходимо:
        // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
        // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
        // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
        // 3. Создать два экземпляра этих классов, и вызвать методы характерные для них

        Toyota toyota1 = new Toyota();
        toyota1.start();
        toyota1.light();
        toyota1.music();
        toyota1.stop();

        Jiguli jiguli1 = new Jiguli();
        jiguli1.start();
        jiguli1.light();
        jiguli1.stop();
        jiguli1.breakCar();
        System.out.println();

        //Задача №2
        //Необходимо:
        // 1. Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 2. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"

        FileReader fileReader = new FileReader("C:\\Users\\User\\IdeaProjects\\Practice_Java_picabu\\Practice_3\\my_first_file.txt");
        BufferedReader myText = new BufferedReader(fileReader);
        String line1 = myText.readLine();
        String line2 = myText.readLine();
        System.out.println(line1 + " " + line2);
        System.out.println();

        //Задача №3
        //Необходимо:
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300

        Financial_record record1 = new Financial_record(300, 500);
        FileWriter fileWriter = new FileWriter("C:\\Users\\User\\IdeaProjects\\Practice_Java_picabu\\Practice_3\\report.txt");

        fileWriter.write("доходы = " + record1.income + ", расходы = " + record1.outcomes);
        fileWriter.close();

    }
}
