public void addProcess(SimulatedProcess proc) {
    queueList.get(((proc.getPriority()) - 1)).add(proc);
}