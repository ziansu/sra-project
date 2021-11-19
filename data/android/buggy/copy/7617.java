@java.lang.Override
public java.util.List<com.yotouch.core.entity.MetaEntity> getMetaEntities() {
    java.util.List<com.yotouch.core.entity.MetaEntity> l = new java.util.ArrayList(userEntities.values());
    l.addAll(this.userEntities.values());
    return l;
}