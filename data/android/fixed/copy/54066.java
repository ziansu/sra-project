public static void attack() {
    if ((Parse.mon) == null) {
        java.lang.System.out.println("There is no monster to attack!");
    }else {
        java.lang.System.out.println("You used your sword on the monster and inflicted 5 damage.");
        Parse.mon.decreaseHealth(5);
    }
}