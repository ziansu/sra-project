public void halt() {
    setStateHalt(true);
    writeOutputFile = new clases.WriteOutputFile(outputFileName, outputTape);
}