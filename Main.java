        import java.util.Scanner; // імпорт сканера

public abstract class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length;

        System.out.println("Введіть розмір масиву");
        length=scanner.nextInt();

        int [] array = new int[length]; //ініціалізація масиву з довжиною length

        for (int i = 0; i < array.length; i++) { //вводити елемент доки масив не закінчиться
            System.out.print("Введіть " + i + " число ");
            array[i] = scanner.nextInt();
        }

        System.out.println(arrayCheck(array));// Функція,яка починає виконання завдання 1
        System.out.println(FizzBuzz());//Функція,яка починає виконання завдання 2
    }
    private static boolean arrayCheck(int [] array) { //Завдання 1

        if(array.length>=2) { //якщо розмір масиву більший або дорівнює 2

            boolean tag = false;

            for (int i = 0; i < array.length-1; i++) { //Перевірка масиву
                if(array[i+1]>=array[i]) { //якщо i+1 елемент більше або дорівнює i елементу, тоді
                    tag = true;
                }
                else { //Інакше:
                    tag = false;
                    break;
                }
            }
            return tag;
        }

        return false;

    }
    private static int FizzBuzz() { //Завдання 2
        for (int i =1; i <= 100; i++) { //начало цикла
            if (i % 15 == 0) {
                System.out.println("FizzBuzz"); //вивести FizzBuzz замість елемента, кратного 3 та 5
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); //вивести Fizz замість елемента, кратного 3
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); //вивести Buzz замість елемента, кратного 5
            } else {
                System.out.println(i); //вивести усі інщі елементи
            }
        }
        return 0;
    }
}
