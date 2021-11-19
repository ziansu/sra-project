public biotec.bsi.ngs.vardetect.core.AlignmentResultRead alignMultithreadLongRead(biotec.bsi.ngs.vardetect.core.ReferenceSequence ref, biotec.bsi.ngs.vardetect.core.InputSequence input, int numThread, int numMer, int threshold) throws java.lang.InterruptedException {
    this.setReferenceSequence(ref);
    return alignMultithreadV5(input, numThread, numMer, threshold);
}