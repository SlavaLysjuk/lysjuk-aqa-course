public class HomeWork8_1_1 {

    public int countEvenInts(int[] nums) {
        int count = 0;

        for (int num : nums) {

            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}

