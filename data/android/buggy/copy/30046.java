public int number() {
    java.lang.System.out.println("Guess a number in 0..100 range: ");
    try (final java.util.Scanner keyboard = new java.util.Scanner(java.lang.System.in)) {
        return keyboard.nextInt();
    }
}