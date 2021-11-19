@java.lang.Override
public boolean saveOrUpdate() {
    com.jfinal.plugin.ehcache.CacheKit.remove(io.jpress.model.CACHE_NAME, getOptionKey());
    return super.saveOrUpdate();
}