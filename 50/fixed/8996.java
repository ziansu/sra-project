public void setPercentTolerance(double p) {
    if ((GetActiveController()) == null)
        return ;
    
    GetActiveController().setPercentTolerance(p);
}