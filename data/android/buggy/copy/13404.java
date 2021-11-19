public void logObservations(conifer.io.CopyNumberTreeObservation observation) {
    java.lang.System.out.println(observation.toString());
    writeCTMC(observation);
    writeEmission(observation);
}