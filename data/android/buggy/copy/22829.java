private void bigBlind() {
    myDebt = myDebt.subtract(pokerTable.getDefaultPot());
    alreadInPot = alreadInPot.add(pokerTable.getDefaultPot());
    sendPlayerCommand(HoldemPlayerCommandType.BLIND, pokerTable.getDefaultPot(), null);
}