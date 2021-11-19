public static void fetchMemory(char address) {
    com.architecture.project.processer.registers.Registers.memoryAddressRegister.setOne(address);
    char data = com.architecture.project.memory.MainMemory.fetch(address);
    com.architecture.project.processer.registers.Registers.memoryBufferRegister.setOne(data);
}