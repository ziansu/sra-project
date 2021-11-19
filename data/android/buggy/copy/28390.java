public void removeCurrentProcess() {
    printProcessTable();
    m_processes.remove(m_currProcess);
    freeCurrProcessMemBlock();
}