public void removeCurrentProcess() {
    printProcessTable();
    freeCurrProcessMemBlock();
    m_processes.remove(m_currProcess);
}