

import java.util.ArrayList;
import java.util.Scanner;

public class dz4 {
    public static void main(String[] ags) {
        Boolean run = true;
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> patronym = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        System.out.println("Введите фио, возраст и пол");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (run) {
            String str = scanner.nextLine();

            if (str.equals("Всё")) {
                break;
            }

            String[] fio = str.split(" ");
            index.add(i);
            surname.add(fio[0]);
            name.add(fio[1]);
            patronym.add(fio[2]);
            age.add(Integer.parseInt(fio[3]));
            gender.add(fio[4]);

            i++;
        }
        ArrayList<Integer> temporary = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            temporary.add(age.get(j));

        }
        // Сортировка индексов по возрасту
        for (int j = 0; j < index.size() - 1; j++) {
            for (int k = 0; k < index.size() - 1 - j; k++) {
                if (temporary.get(k) > temporary.get(k + 1)) {

                    int tmp = index.get(k);
                    index.set(k, index.get(k + 1));
                    index.set(k + 1, tmp);
                    tmp = temporary.get(k);
                    temporary.set(k, temporary.get(k + 1));
                    temporary.set(k + 1, tmp);

                }
            }
        }
        for (int j = 0; j < index.size(); j++) {
            System.out.printf("%s %s. %s. %s %s \n", surname.get(index.get(j)), name.get(index.get(j)).charAt(0),
                    patronym.get(index.get(j)).charAt(0), age.get(index.get(j)), gender.get(index.get(j)));
        }

        ArrayList<String> temporary2 = new ArrayList<>();
        for (int j = 0; j < index.size(); j++) {
            temporary2.add(gender.get(index.get(j)));
        }

        // Сортировка по полу
        for (int j = 0; j < index.size() - 1; j++) {

            if (temporary2.get(j).contains("м") && temporary2.get(j + 1).contains("ж")) {
                int tmp = index.get(j);
                index.set(j, index.get(j + 1));
                index.set(j + 1, tmp);
                String tmp2 = temporary2.get(j);
                temporary2.set(j, temporary2.get(j + 1));
                temporary2.set(j + 1, tmp2);

            } else continue;
        }
        System.out.println("\n");
        for (int j = 0; j < index.size(); j++) {
            System.out.printf("%s %s. %s. %s %s \n", surname.get(index.get(j)), name.get(index.get(j)).charAt(0),
                    patronym.get(index.get(j)).charAt(0), age.get(index.get(j)), gender.get(index.get(j)));
        }
    }
}

