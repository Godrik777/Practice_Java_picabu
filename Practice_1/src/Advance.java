import java.util.Arrays;

public class Advance {
    public static void main(String[] args) {
        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"
        String numbers = "234";
        int text = Integer.parseInt(numbers);
        String sometext = "some_text";
        int length = sometext.length();
        int sum = text + length;
        System.out.println(sum);

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3;
        int b = 5;
        double c = Math.pow(a + b, 2);
        System.out.println(c);

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

        int[] massive1 = new int[]{1, 2, 5, 7, 10};
        int[] massive2 = new int[]{2, 3, 2, 17, 15};
        int[] total = new int[5];
        for (int i = 0; i < massive1.length; i++) {
            total[i] = massive1[i] * massive2[i];
        }
        int[] sumMassive = new int[massive1.length + massive2.length];
        System.arraycopy(massive1, 0, sumMassive, 0, massive1.length);
        System.arraycopy(massive2, 0, sumMassive, massive1.length, massive2.length);
        int[] totalMassive = new int[sumMassive.length + total.length];
        System.arraycopy(sumMassive, 0, totalMassive, 0, sumMassive.length);
        System.arraycopy(total, 0, totalMassive, sumMassive.length, total.length);
        System.out.println(Arrays.toString(totalMassive));

        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран

        String helloWorld = "Hello world!";
        String replace = helloWorld.replace('l', 'r');
        String upper = replace.toUpperCase();
        String reduce = upper.substring(0, 8);
        System.out.println(reduce);
    }
}

