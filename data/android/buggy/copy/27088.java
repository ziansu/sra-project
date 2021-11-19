public long getBreakpointAddress(int index) {
    if ((index < 0) || (index > (breakpoints.size())))
        return Constants.PLP_NUMBER_ERROR;
    
    return breakpoints.get(index).getAddr();
}