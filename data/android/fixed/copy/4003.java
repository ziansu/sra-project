public void overGuess() {
    java.lang.System.out.print((("Your guess must be less than " + (maxNumber)) + " Try Again: "));
    answer = scanner.nextInt();
    checkAnswer();
}