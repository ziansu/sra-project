@org.springframework.transaction.annotation.Transactional
public void setCriticalLow(java.lang.Integer value) {
    if (value == null) {
        this.storeSetting(fi.hut.soberit.agilefant.business.impl.SettingBusinessImpl.SETTING_NAME_CRITICAL_LOW, value);
    }else {
        this.storeSetting(fi.hut.soberit.agilefant.business.impl.SettingBusinessImpl.SETTING_NAME_CRITICAL_LOW, fi.hut.soberit.agilefant.business.impl.DEFAULT_CRITICAL_LOW);
    }
}