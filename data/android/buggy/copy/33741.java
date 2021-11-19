public void executeProgramInstruction() {
    int opcode = getCurrentOpcode();
    java.lang.System.out.println(java.lang.Integer.toHexString(opcode));
    opcodeHandler.executeOpcode(opcode);
}