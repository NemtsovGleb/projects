import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        int idx = 0;
        // до джавы 5
        while(iterator.hasNext()) {
            System.out.println(iterator.next());

            if(idx==1)
                iterator.remove();

            idx++;
        }

        System.out.println(list);
        // джава 5
//        for(int x : list) {
//            list.remove(1);
//
//            System.out.println(x);
//        }
    }
}