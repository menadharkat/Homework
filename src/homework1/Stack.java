package homework1;

public class Stack {
    public class Stack {
        int B = 0;
        int[] array = new int[3];

        public Stack() {
        }

        public void push(int data) {
            this.array[this.B] = data;
            ++this.B;
        }

        public void Show() {
            int[] var1 = this.array;
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                int S = var1[var3];
                System.out.println(S);
            }

        }



