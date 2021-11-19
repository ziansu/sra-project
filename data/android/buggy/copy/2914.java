public machine.InstructionEntry getNextInstruction() {
    machine.InstructionEntry result = instructionList.get(pcCounter);
    (pcCounter)++;
    simulator.getGui().setCurrentPC(pcCounter);
    return result;
}