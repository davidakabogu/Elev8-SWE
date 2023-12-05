
public class Program {
    public static void main(String[] args) {
        int[] array = { 1, 2, 91, 4, 5 };
        System.out.println(getMaxNumber(array));
    }

    private static int getMaxNumber(int[] array) {
        int maxNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}
