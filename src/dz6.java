/*Разработать программу, имитирующую поведение коллекции HashSet.
В программе содать метод add добавляющий элемент, метод toString возвращающий строку
с элементами множества и метод позволяющий читать элементы по индексу.*/
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class dz6 {

    public static void main(String[] args) {
        MySet x = new MySet();
        System.out.println(x.isEmpty());
        System.out.println(x.add(1));
        System.out.println(x.add(2));
        System.out.println(x.add(3));
        HashSet<Integer> myHS = new HashSet<>();
        myHS.add(7);
        System.out.println(x.del(9));
        System.out.println(x.del(10));
        System.out.println(x.isEmpty());
        System.out.println(x.contains(0));
        x.add(20);
        System.out.println(x.get(1));

        Iterator<Integer>iterator = x.iterator();
        while (iterator.hasNext()) {
            int i=iterator.next();
            System.out.println(i);
        }
    }
}

class MySet{
    private HashMap<Integer,Object> values = new HashMap<>();
    private static Object X = new Object();
    public boolean add(int elem) {
        return values.put(elem,X) == null;
    }

    public boolean del(int elem){
        return values.remove(elem)==X;
    }
    public boolean isEmpty(){
        return values.size()==0;
    }

    public boolean contains(int elem){
        return values.containsKey(elem);
    }

    public int get(int index){
        Object[] a = values.keySet().toArray();
        return (int) a[index];
    }

    public Iterator<Integer> iterator(){
        return  values.keySet().iterator();
    }

}