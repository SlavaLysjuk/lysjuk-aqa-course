public class HomeWork7_2 {

    public static String concatStr(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(str1.length(), str2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < str1.length()) {
                result.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                result.append(str2.charAt(i));
            }
        }
        return result.toString();
    }
}

