public class Main {
    public static void main(String[] args) {
        showIndex(new String [] {"b", "c", "9", "this", "this", "this", "this", "this", "3"});
        showIndex(new String [] {"a", "a", "1", "this"});
    }
    public static void showIndex(String [] array) {
        if (array.length==0) {
            System.out.println("array is empty");
        } else {
            String indexes = "";
            for (int a = 0; a < array.length; a++) {
                if ("this".equals(array[a])) {
                    if (!indexes.isEmpty()) {
                        indexes += ", ";
                    }
                    indexes += a;
                }
                System.out.println(indexes);
            }
        }
    }
}