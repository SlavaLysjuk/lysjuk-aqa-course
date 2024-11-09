public class HomeWork7_1 {

    public String lastString(String str, int n) {
        String result = "";

        if (str.length() >= 3) {
            for (int i = 0; i < n; i++) {
                result += str.substring(str.length() - n, 5);
            }
        }
        return result;
    }
}
