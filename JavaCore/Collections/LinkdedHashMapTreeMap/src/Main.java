import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();// Внутри не гарантируется порядок


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // В каком порядке были добавлены в таком
        // они и вернутся


        Map<Integer, String> treeMap = new TreeMap<>(); // Пары будут отсортированы по ключу( естественный порядок)
        // в случае числе буде реализация по возрастанию
        // в случае строк лексикографический
        // для ключа должен быть задан критерий сортировки( в случае use своих объектов)

        testMap(treeMap);


    }

    public static void testMap(Map<Integer, String> map){
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }

}