public void addMachine(java.io.File machine) {
    machines.add(new de.prob2.ui.project.Machine(machine.getName().split("\\.")[0], "", machine));
}