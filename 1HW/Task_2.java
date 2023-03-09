// Вывести все простые числа от 1 до 1000



public class Task_2 {
    public static void main(String[] args) {
        int temp = 0;
        int count = 1;
        System.out.print("2 ");
        for (int i = 2; i < 1001; i++) {
            temp = 0;
            for (int index = 2; index < i; index++) {
                if ( index == i ){
                    continue;                   
                }
                if (i % index == 0) {
                    temp = 0;
                    break;                                      
                }
                else{
                    temp += 1;
                }
            } 
            if (temp != 0) 
            {
                count += 1;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n Итого " + count + " чисел");
    }

}
