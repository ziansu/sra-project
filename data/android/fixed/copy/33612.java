public static int getBuyPrice() {
    return 300 + ((Turns.rounds) * ((int) ((java.lang.Math.random()) * (100 + 1))));
}