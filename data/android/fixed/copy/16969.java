public void setAbsoluteTolerance(double t) {
    if ((GetActiveController()) == null)
        return ;
    
    GetActiveController().setAbsoluteTolerance(t);
}