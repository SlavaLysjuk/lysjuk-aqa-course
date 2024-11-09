public class HomeWork7_4 {

    public String zipZap(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // Перевіряємо шаблон "z*p", де * може бути будь-яким символом
            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                // Додаємо перший і третій символи "zp"
                result.append("zp");
                // Пропускаємо середній символ
                i += 2;
            } else {
                // Якщо шаблон не відповідає, додаємо поточний символ
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
