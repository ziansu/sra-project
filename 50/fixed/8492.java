public static void nextLevel() {
    switch (breakout.Level.level) {
        case ONE :
            breakout.Level.level = breakout.Level.TWO;
            break;
        case TWO :
            breakout.Level.level = breakout.Level.THREE;
            break;
        case THREE :
            breakout.Level.level = breakout.Level.VICTORY;
            break;
        default :
            breakout.Level.level = breakout.Level.ONE;
            break;
    }
}