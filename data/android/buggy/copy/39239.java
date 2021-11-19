public synchronized void setFitness(double _fitness) {
    java.lang.System.out.println("Fitness set");
    fitness = _fitness;
    fitnessCalculated = true;
    this.notifyAll();
}