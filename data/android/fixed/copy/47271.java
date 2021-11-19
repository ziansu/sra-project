public void setOptions(gdsc.core.clustering.optics.OPTICSManager.Option... options) {
    if (options == null)
        return ;
    
    for (gdsc.core.clustering.optics.OPTICSManager.Option option : options)
        this.options.add(option);
    
}