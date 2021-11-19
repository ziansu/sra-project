private antgameproject.Instruction getInstruction(antgameproject.Colour antColour, int brainState) {
    if (antColour == (Colour.RED)) {
        return playerOne.getState(brainState);
    }else {
        return playerTwo.getState(brainState);
    }
}