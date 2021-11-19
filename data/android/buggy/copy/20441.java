public static DiceValue getRandom() {
    int random = DiceValue.RANDOM.nextInt(DiceValue.SPADE.ordinal());
    return DiceValue.values()[random];
}