public void setOutputRange(double minimumOutput, double maximumOutput) {
    if ((GetActiveController()) == null)
        return ;
    
    GetActiveController().setOutputRange(minimumOutput, maximumOutput);
}