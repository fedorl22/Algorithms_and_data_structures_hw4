package les4;

import java.util.Iterator;
import java.util.Map;

import java.util.HashMap;

public class Program {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // HashMap<String, String> hashMap = new HashMap<>();
        // hashMap.put("+79008007766", "Андрей");
        // hashMap.put("+79008007765", "Андрей");
        // hashMap.put("+79008007766", "Сергей");
        // System.out.println(hashMap.size());

        HashMap<String, String> hashMap = new HashMap<>(4);

        String prevValue = hashMap.put("+79008007766", "Андрей");
        prevValue = hashMap.put("+79008007766", "Андрей");
        prevValue = hashMap.put("+79008007765", "Сергей");
        prevValue = hashMap.put("+79008007765", "Андрей");
        System.out.println(prevValue);
        prevValue = hashMap.put("+79008007765", "Ing");
        System.out.println(prevValue);
        String seachValue = hashMap.get("+79008007765");
        System.out.println(seachValue);
        hashMap.remove("+79008007765");
        System.out.println();
        hashMap.remove("+79008007765");
        System.out.println(prevValue);
        System.out.println(seachValue);
        System.out.println();
        // HashMap<Integer, String> hMap = new HashMap<>(8);
        // HashMap<String, Integer> oneMap = new HashMap<>(8);

        // hMap.put("222222222", "qqq");
        // hMap.put("333333333", "www");
        // hMap.put("444444444", "zzz");
        // hMap.put("333333333", "eee");
        // hMap.put("333333333", "www");
        // hMap.put("222222222", "xxx");

        // Human human1 = new Human();
        // human1.name = "User";
        // human1.age = 25;
        // Human human2 = new Human();
        // human2.name = "User";
        // human2.age = 25;
        // System.out.println(human1.equals(human2));

        seachValue = hashMap.get("+79998887755");

        System.out.println(seachValue);
        System.out.println("--------------------------------------");

        for (

        HashMap.Entity item : hashMap) {
            System.out.println(item);
        }

        class Human {
            String name;
            int age;

            @Override
            public boolean equals(Object obj) {
                if (this == obj)
                    return true;
                if (obj instanceof Human) {
                    Human human = (Human) obj;
                    if (name.equals(human.name) && age == human.age)
                        return true;

                }
                return false;
            }
        }
    }
}
// return super.equals(ob);
