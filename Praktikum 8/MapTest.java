import java.util.*;

public class MapTest {
    public static void main(String[] args){
        //kunci
        Map<Integer, String> map = new HashMap<Integer,String>();
        //Menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        //Mengambil elemen pertama
        System.out.println(map.get(1));
        //Mengambil keseluruhan kunci sebagai objek
        Set<Integer> key = map.keySet();
        //Iterasi
        for(Integer k : key){
            System.out.print(k+" ");
        }
    }
}