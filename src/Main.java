public class Main {
    public static void main(String[] args) {
        String name = "\u0048\u0069\u0061\u0067\u006F"; // Hiago in Unicode
        String waveEmoji = "\uD83D\uDC4B"; // Waving hand emoji

        System.out.println("Hi " + waveEmoji + ", my name is \"" + name + "\".");

        System.out.println("The size of the string is: " + name.length());

        for (int i = 0; i < 10; i++) {
            int randomNumber = RandomNumbers.getRandomInt(0, 2000000000);
            System.out.println("Random Number: " + randomNumber);

            if (randomNumber <= Byte.MAX_VALUE) {
                System.out.println("The preferred data type is: byte");
            } else if (randomNumber <= Short.MAX_VALUE) {
                System.out.println("The preferred data type is: short");
            } else if (randomNumber <= Integer.MAX_VALUE) {
                System.out.println("The preferred data type is: int");
            } else {
                System.out.println("The preferred data type is: long");
            }
        }
    }
}
