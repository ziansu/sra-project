public static void main(java.lang.String[] args) {
    CPU cpu = new CPU();
    cpu.initialize();
    for (; ;) {
        cpu.op();
    }
}