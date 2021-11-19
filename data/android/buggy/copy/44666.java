public double computeNextStep() {
    if (scnr.hasNextLine()) {
        currentUsage = scnr.nextDouble();
        scnr.nextLine();
    }else {
        finished = true;
    }
    return currentUsage;
}