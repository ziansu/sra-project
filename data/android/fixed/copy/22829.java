private void bigBlind() {
    alreadInPot = alreadInPot.add(pokerTable.getDefaultPot());
    sendPlayerCommand(HoldemPlayerCommandType.BLIND, pokerTable.getDefaultPot(), null);
}