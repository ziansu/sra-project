public void PipeOutputTo(process.SProcessPiped process) {
    this.outputPipe = process;
    process.inputPipe = this;
    process.PipeThread pipe = new process.PipeThread(this.stdNormalOut, process.stdInput, this);
    new java.lang.Thread(pipe).start();
}