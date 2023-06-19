public class dz2 {

    import java.io.*;
    public class dz2 {

/*Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */

//    public static void main(String[] args) {
//
//        String s = ("{\"name\":\"Ivanov\"," +
//                " \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
//
//        String line = s.replace("{", "").replace("}", "").replace("\"", "");
//        System.out.println(line);
//
//        StringBuilder result = new StringBuilder("select * from students where ");
//
//        String [] arrayData = line3.split(", ");
//        for (int i =0; i < arrayData.length; i++) {
//            String[] arrData = arrayData[i].split(":");
//            if (arrData[1].equals("null") == false) {
//                if (i != 0) {
//                    result.append(", ");
//                    result.append(arrData[0]);
//                    result.append(" = ");
//                    result.append(arrData[1]);
//                } else {
//                    result.append(arrData[0]);
//                    result.append(" = ");
//                    result.append(arrData[1]);
//                }
//
//            }
//        }
//        System.out.println(result);
//    }
/* Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */
//    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder({"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"});
//        System.out.println(builder);
//    }

        public static void main(String[] args) {



            String[] arrayData = new arrayData([{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]);

        }


    }
