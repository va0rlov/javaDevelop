public class Puzzle {
    private static boolean condition;

    public static void main(String[] args) {
        String answer = "Какое самое главное число во вселенной?";

        byte initialSum = 120;
        short additionalSum = 31999;
        int secretSum = 162;

        byte number = (byte) (initialSum * additionalSum + secretSum);

        if (!condition) {
            answer = "Ответ на главный вопрос жизни, вселенной и всего такого: ";
            System.out.println(answer + number);
        } else {
            System.out.println(answer);
        }

    }
}