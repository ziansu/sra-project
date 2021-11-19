public void setPC(int n) {
    pc = n;
    current = new com.wcmarshall.jpropsim.disassembler.Instruction(this, cogram[pc]);
    next = new com.wcmarshall.jpropsim.disassembler.Instruction(this, cogram[((pc) + 1)]);
}