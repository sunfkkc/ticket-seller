import java.util.*;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(new Integer(5));
        arrayList.add(new Integer(4));
        arrayList.add(new Integer(3));
        arrayList.add(new Integer(2));
        arrayList.add(new Integer(1));
        arrayList.add(new Integer(0));
        arrayList.add(new Integer(-1));

        print(arrayList);


        ArrayList arrayList1 = new ArrayList(arrayList.subList(1,4));

        System.out.println(arrayList);
        System.out.println(arrayList1);

        Collections.sort(arrayList);

        final int LIMIT = 10;

        String source = "aslkdjfsldkjflskdjfweoir";
        int length = source.length();

        List list = new ArrayList(length/LIMIT + 10);


    }

    static void print(Collection c){
        Iterator it = c.iterator();


        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    static void printReverse(List list){
        ListIterator listIterator = list.listIterator();

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous()
            );
        }
    }
}

class MyVector2 implements Iterator{
    int cursor=0;
    int lastRet = -1;
    public Iterator iterator(){
        cursor=0;
        lastRet=-1;
        return this;
    }

    public boolean hasNext(){
        return false;
    }

    public Object next(){
        Object next = new Object();
        lastRet = cursor++;
        return next;
    }

}