    public class dz2 {

/*Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */

    public static void main(String[] args) {

        String s = ("{\"name\":\"Ivanov\"," +
                " \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");

        String line = s.replace("{", "").replace("}", "").replace("\"", "");
        System.out.println(line);

        StringBuilder result = new StringBuilder("select * from students where ");

        String [] arrayData = line3.split(", ");
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            if (arrData[1].equals("null") == false) {
                if (i != 0) {
                    result.append(", ");
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                } else {
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                }

            }
        }
        System.out.println(result);
    }


/* Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */

        //Споткнулся на простом, не смог строку перевести в массив

        public static void main(String[] args) {
            String[] arrayData = [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}];


         {
            String line1 = line.replace("{", "");
            String line2 = line1.replace("}", "");
            String line3 = line2.replaceAll("\"", "");
            String line4 = line3.replace("[", "");
            String line5 = line4.replace("]", "");
            StringBuilder result = new StringBuilder("");
            String[] arrayData = line5.split(",");
            String[] listName = {"Студент ", " получил ", " по предмету "};
            for (int i = 0; i < arrayData.length; i++) {
                String[] arrData = arrayData[i].split(":");
                result.append(listName[i]);
                result.append(arrData[1]);
            }
            return result;
        }
    }

        /*Сравнить время выполнения замены символа "а" на "А" любой строки содержащей
        1000 символов средствами String и StringBuilder.*/

        public static void main(String[] args) {

            String s = "I love thee, city of peter's making" +
                    "i love thy harmonies austere" +
                    "And Neva's Sovran waters breaking" +
                    "Along the banks of granite sheer" +
                    "Thy traceried iron gates, thy sparkling" +
                    "Yet Moouless, mediative gloom" +
                    "And thy transparent twilight darkling" +
                    "And when I write within my room" +
                    "or Lampless, read - then, sunk, in slumber" +
                    "The empty thoroughfares, past number" +
                    "Are piled, stand clear upon the night" +
                    "The admiralty spire is bright" +
                    "Nor may the darkness mount, to smother" +
                    "The golden cloudland of the light" +
                    "For soon one dawn succeeds another" +
                    "With barely half-an-hour of night" +
                    "I love thy ruthless winter, lowering" +
                    "With bitter frost and windless air" +
                    "The sledges along Neva scouring" +
                    "Girls' cheeks - no roses so bright and fair!" +
                    "The flash and noise of balls, the chatter" +
                    "The bachelor's house of feasting, too" +
                    "The cups that foam and hiss and spatter" +
                    "The punch that in the bowl burns blue" +
                    "I love the warlike animation" +
                    "On playing-fields of Mars to see" +
                    "The troops of foot and horse in station" +
                    "And their superb monotony" +
                    "Their ordered, undulating muster" +
                    "Flags tattered on the glorious day" +
                    "Those brazen helmets in their luster" +
                    "Shot through and riddled in the fray" +
                    "I love thee, city of soldiers, blowing" +
                    "Smoke from thy forts, thy booming gun" +
                    "-- Northern empress is bestowing" +
                    "Upon the royal house a son" +
                    "Or when, another battle won," +
                    "Proud Russia holds her celebration" +
                    "Or when the Neva breaking free" +
                    "Her dark-blue ice bears out to sea" +
                    "And scents the spring, in exultation" +
                    "Now, city of Peter, stand thou fast" +
                    "Foursquare like Russia, vaunt thy splendor!" +
                    "The very element shall surrender" +
                    "And make her peace with thee at last" +
                    "Their ancient bondage and their rancors" +
                    "The finnish waves shall buy deep" +
                    "Nor vex with idle spite that cankers" +
                    "Our Peter's everlasting sleep!";


            long start = System.nanoTime();
            String text = s.replace("a", "A");
            System.out.println(System.nanoTime() - start);

            start = System.nanoTime();
            StringBuilder text2 = new StringBuilder(text);
                int i = text2.indexOf("a");
            while(i > 0){
                text2.replace(i,i+1,"a");
                i = text2.indexOf("A");
            }
            System.out.println(System.nanoTime() - start);
        }
    }