//  Задание
//
//  Пусть дан произвольный список целых чисел.
//
//  1) Нужно удалить из него чётные числа
//  2) Найти минимальное значение
//  3) Найти максимальное значение
//  4) Найти среднее значение
import java.util.*;
public class dz3 {
    public static void main(String[] args) {
        double sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println(list);

        //  1) Нужно удалить из него чётные числа
/*        for (int i=0;i<list.size();i++){
            int even=list.get(i)%2;
            if (even==0){
                System.out.println("Четное число:"+ list.get(i));
                list.remove(i);
            }*/

        for (int j = 0; j < list.size(); j++) {
            sum +=list.get(j);
        }
        double middle = sum/10;
        list.sort(Comparator.naturalOrder());
        System.out.println("Минимальное значение "+list.get(0));
        System.out.println("Максимальное значение "+list.get(9));
        System.out.println("Среднее значение "+middle);
        }


    }

