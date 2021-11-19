public void removeCurrentProcess() {
    m_processes.remove(m_currProcess);
    freeCurrProcessMemBlock();
}