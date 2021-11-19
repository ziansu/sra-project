public pisada.fallDetector.Acquisition get(int i) {
    if ((timerAcquisitionList.size()) > i)
        return this.timerAcquisitionList.get(i);
    
    return null;
}