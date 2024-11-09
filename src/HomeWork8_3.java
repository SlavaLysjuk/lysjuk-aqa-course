public class HomeWork8_3 {

    public static int sumIgnoreSections(int[] nums) {
        int sum = 0;
        boolean ignore = false;

        for (int num : nums) {
            if (num == 6) {
                ignore = true;
            }

            if (!ignore) {
                sum += num;
            }

            if (num == 7 && ignore) {
                ignore = false;
            }
        }

        return sum;
    }


}
