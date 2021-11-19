private void doStart(data.Instruction instructie, int klok) {
    java.lang.Process process = new java.lang.Process(instructie.getPid(), sizeVirtual);
    process.setLastAccesTime(klok);
    ram.addProcess(process);
    processList.addProcess(process);
}