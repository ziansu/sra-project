public void halt() {
    setStateHalt(true);
    java.lang.System.out.println(("Cinta de salida: " + (outputTape.getTapeContent())));
    writeOutputFile = new clases.WriteOutputFile(outputFileName, outputTape);
}