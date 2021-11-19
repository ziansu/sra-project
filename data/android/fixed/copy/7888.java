public int getLineIndex() {
    if ((this.progCode.size()) >= (this.programCounter))
        return 0;
    
    return this.progCode.get(this.programCounter).getLineIndex();
}