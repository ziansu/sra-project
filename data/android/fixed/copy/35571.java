public java.lang.String keepName() {
    pc.setLevel(java.lang.Integer.parseInt(dice.rollDice(1, 10)));
    players.addCharacter(pc);
    hpInitializer.changeHP(pc, 0);
    conversation.end();
    return "index";
}