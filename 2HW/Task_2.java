import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task_2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("marks.txt"));
            String info;
            String[] sample = { "Студент ", " получил ", " по предмету " }; // шаблон, который я добавляю к полученнму результату
            StringBuilder sb = new StringBuilder();
            while ((info = br.readLine()) != null) { // работаю с каждой строкой отдельно
                String info_replace = info.replace("\"", ""); // удаление кавычек
                String[] words = info_replace.split(","); // создание массива из строки
                for (int i = 0; i < words.length; i++) {  
                    String[] result = words[i].split(":"); // каждый элемент предыдущего массива становится массивом из 2х элементов
                    sb.append(sample[i] + result[1]); 

                }
                System.out.println(sb);
                sb.delete(0, sb.length());
            }
            br.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
// Ниже то же самое без StringBuilder

/*
public class Task_2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("marks.txt"));
            String info;
            String[] sample = { "Студент ", " получил ", " по предмету " };
            while ((info = br.readLine()) != null) {
                String info_replace = info.replace("\"", "");
                String[] words = info_replace.split(",");
                for (int i = 0; i < words.length; i++) {
                    String[] words_second = words[i].split(":");
                    System.out.print(sample[i] + words_second[1]);
                }
            System.out.println("\n");
            }
            br.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
*/