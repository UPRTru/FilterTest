import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FilterTest filterTest = new FilterTest();
        String test = "test1";
        Integer test2 = 1;
        Object array[] = new Object[]{test, test2, null, "test2", 2};

        System.out.println(Arrays.toString(filterTest.filter(array, String.class)));
        System.out.println(Arrays.toString(filterTest.filter(array, test.getClass())));

        System.out.println(Arrays.toString(filterTest.filter(array, Integer.class)));
        System.out.println(Arrays.toString(filterTest.filter(array, test2.getClass())));
    }
}
