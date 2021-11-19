public boolean validMemory(int addr) {
    return (addr >= (m_registers[sos.CPU.BASE])) && (addr <= (m_registers[sos.CPU.LIM]));
}