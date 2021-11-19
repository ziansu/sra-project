private void syscallPid() {
    int a = m_currProcess.getProcessId();
    m_CPU.pushToStack(a);
}