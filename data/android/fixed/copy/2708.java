@java.lang.Override
public void setLoadMetersEnabled(boolean enabled) {
    if ((fDataModel) != null) {
        if ((m_loadMetersEnabled) == enabled) {
            return ;
        }
        m_loadMetersEnabled = enabled;
        fDataModel.setLoadMetersEnabled(m_loadMetersEnabled);
        disposeLoadMeterTimer();
    }
}