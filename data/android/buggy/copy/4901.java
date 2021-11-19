private void alphabetized() {
    PipeFilter.Information info = inPipe.read();
    java.util.Collections.sort(info.getLines());
    outPipe.write(new PipeFilter.Information(info.getLines(), info.getIgnoreWords()));
}