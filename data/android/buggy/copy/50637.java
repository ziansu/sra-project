private void setMeterListeners(jonasandtim.energietagebuch.Data.DataInterfaces.KBRDataHasChangedListener listener) {
    if ((mMeters) == null)
        return ;
    
    for (jonasandtim.energietagebuch.Data.Meter.Meter m : mMeters) {
        m.setDataHasChangedListener(listener);
    }
}