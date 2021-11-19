public static void checkersAi() {
    java.lang.System.out.println("\nAI is thinking...\n");
    Checkers.checkValidHops();
    if ((Checkers.hopMoveFound) == false) {
        Checkers.validMovePlaces();
    }
}