public class HomeWork8_2 {

    public static int centeredAverage(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        sum -= min;
        sum -= max;

        return sum / (nums.length - 2);
    }

}
