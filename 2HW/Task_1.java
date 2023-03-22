import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {

    public static int[] fill_array() {    //Создание и заполнение массива
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int array_len = in.nextInt();
        int my_array[] = new int[array_len];
        for (int i = 0; i < array_len; i++) {
            System.out.printf("Введите %d-й элемент массива: ", i + 1);
            int new_element = in.nextInt();
            my_array[i] = new_element;
        }
        in.close();
        return my_array;
    }

    public static void sort_array(int[] array) {    // Сортировка и запись в файл
        File log = new File("log.txt");      
        try {
            FileWriter fw = new FileWriter(log);
            fw.write("Первоначальный массив: " + Arrays.toString(array));
            fw.write("\n");
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                        fw.write(Arrays.toString(array));
                        fw.write("\n");
                    }
                }
            }
            fw.close();
        } 
        catch (IOException e) {
            System.out.println("ERROR ");
        }
    }

    public static void main(String[] args) {
        sort_array(fill_array());

    }
}
