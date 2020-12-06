package HW7;

import java.util.Scanner;

public class StingArrayMain {

    /* Реализовать простую коллекцию для String на базе массива.
    добавить следующие методы для работы с коллекцией:
    добавлять (add), (по индеку или значению)
    удалять(delete), (по индексу или значению)
    доставать по индексу (get),
    */

    public static String[] myArray = new String[10];
    public static String value = null;

    public static int count = 0;
    public static int choice;
    public static int index;


    public static void main(String[] args) {


        System.out.println("Cоздан String-массив из десяти элементов.");
        while (true) {
            System.out.println("Что вы ходите сделать (введиче число, которое соответствует операции)?");
            System.out.println("1 - Добавить элемент");
            System.out.println("2 - Удалить элемент по индексу");
            System.out.println("3 - Удалить элемент по значению");
            System.out.println("4 - Показать содержимое ячейки");
            System.out.println("5 - Прекратить работу программы");

            while (true) {
                Scanner scanChoice = new Scanner(System.in);
                choice = scanChoice.nextInt();
                if (choice < 6 && choice > 0) {
                    break;
                }
                System.out.println("Вы ввели недопустимое значение. Повторите ввод.");
            }
            if (choice == 2 || choice == 3) System.out.println("Данная функция находится в разработке.");
            if (choice == 5) {
                break;
            }
            if (choice == 4) {
                System.out.println("Вы выбрали показ элемента массива. Введите индекс элемента");
                while (true) {
                    Scanner scanIndex = new Scanner(System.in);
                    index = scanIndex.nextInt();
                    if (index < myArray.length && index >= 0) {
                        break;
                    }
                    System.out.println("Вы ввели недопустимое значение. Повторите ввод.");
                }
                System.out.println(myArray[index]);
            }

            if (choice == 1) {
                System.out.println("Вы выбрали добавление элемента в массив. Введите индекс элемента");
                while (true) {
                    Scanner scanIndex = new Scanner(System.in);
                    index = scanIndex.nextInt();
                    if (index < myArray.length && index >= 0) {
                        if (count < index) {
                            count = index + 1;
                        }
                        break;
                    }
                    System.out.println("Вы ввели недопустимое значение. Повторите ввод.");
                }
                System.out.println("Введите значение элемента");
                Scanner scanValue = new Scanner(System.in);
                String value = scanValue.nextLine();

                StingArrayMain.add(index, value);

            }

        }

    }

    public static void add(int index, String value) {
        int choice2;
        if (myArray[index] != null) {
            System.out.println("Ячейка занята. Вы хотите ");
            System.out.println("1 - перезаписать ячейку");
            System.out.println("2 - добавить элемент со сдвигом последующих за ним элементов");
            while (true) {
                Scanner scanReWrite = new Scanner(System.in);
                choice2 = scanReWrite.nextInt();
                if (choice2 < 3 && choice2 > 0) {
                    break;
                }
                System.out.println("Вы ввели недопустимое значение. Повторите выбор.");
            }
            if (choice2 == 1) {
                myArray[index] = value;
                System.out.println("Сейчас массив имеет вид: ");
                for (int i = 0; i < myArray.length; i++) {
                    System.out.print(myArray[i] + " ");
                }
            }
            if (choice2 == 2) {
                int n;
                if (count == myArray.length) {
                    n = count * 3 / 2 + 1;
                } else {
                    n = count;
                }
                String[] myArray2 = new String[n];
                for (int i = 0; i < myArray.length +1; i++) {
                    if (i < index) {
                        myArray2[i] = myArray[i];
                    } else if (i == index) {
                        myArray2[i] = value;
                    } else {
                        myArray2[i] = myArray[i - 1];
                    }
                }
                myArray[index] = value;
            }
        }
        else {
                myArray[index] = value;
                System.out.println("Сейчас массив имеет вид: ");
                for (int i = 0; i < myArray.length; i++) {
                    System.out.print(myArray[i] + " ");
                }
            }
            System.out.println();
        }
    }

