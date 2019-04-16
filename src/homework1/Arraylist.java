
package homework1;

import java.util.ArrayList;

public class Arraylist {
    public Arraylist() {
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(25);
        list.add("text");
        list.add(new Object());
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.clear();
        if (list.size() != 1) {
            System.out.println("the Array is not equal to 1");
        }

        if (list.contains(25)) {
            System.out.println("the element exist");
        }

        new ArrayList();
        list.add("akli");
        list.add("menad");
        list.add("massi");
        list.add("azul fellawen");
        System.out.println(list);
    }
}
