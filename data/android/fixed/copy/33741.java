public void executeProgramInstruction() {
    int opcode = getCurrentOpcode();
    opcodeHandler.executeOpcode(opcode);
}