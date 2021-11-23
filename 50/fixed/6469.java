@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.List<com.krishagni.catissueplus.core.common.domain.ConfigSetting> getAllSettingsByModule(java.lang.String moduleName) {
    return getCurrentSession().getNamedQuery(com.krishagni.catissueplus.core.common.repository.impl.ConfigSettingDaoImpl.GET_ALL_BY_MODULE).setString("name", moduleName).list();
}