@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.List<com.krishagni.catissueplus.core.common.domain.ConfigSetting> getAllSettings() {
    return getCurrentSession().getNamedQuery(com.krishagni.catissueplus.core.common.repository.impl.ConfigSettingDaoImpl.GET_ALL).list();
}