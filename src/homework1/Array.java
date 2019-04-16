

package homework1;

public class Array {
    public Array() {
    }

    public static void main(String[] args) {
        String[] name = new String[]{"menad", "akli", "mENAD", "massi"};
        System.out.println(name[0]);
        if (name[0].equalsIgnoreCase(name[2])) {
            System.out.println("the two values are the same");
        } else {
            System.out.println("the two values are not the same ");
        }

        if (name[1] == name[3]) {
            System.out.println("the two values are equal");
        } else {
            System.out.println("the two values are not equal");
        }

        int[] number = new int[]{12, 7, 19};
        int calcul = (number[0] + number[1] + number[2]) / number.length;
        System.out.println(number.length);
        System.out.println(calcul);
        int[][] numbers = new int[][]{{5, 7, 8}, {3, 2, 1}, {9, 4, 2}};
        System.out.println(numbers[0][2] + "<--");
        String Actor = "aryastark, jhonsnow,sansastark, tyrionlanister";
        String[] gameofthrones = Actor.split(",");
        System.out.println(gameofthrones.length);
        System.out.println(gameofthrones[0]);
    }
}

