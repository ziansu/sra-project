public void incrementPC() {
    (pc)++;
    current = next;
    next = new com.wcmarshall.jpropsim.disassembler.Instruction(this, cogram[((pc) + 1)]);
}