public void PipeOutputTo(process.SProcessPiped process) {
    this.outputPipe = process;
    process.inputPipe = this;
    process.PipeThread pipe = new process.PipeThread(this.stdNormalOut, process.stdInput);
    new java.lang.Thread(pipe).start();
}