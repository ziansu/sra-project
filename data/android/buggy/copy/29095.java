@java.lang.Override
public com.github.kolandroid.kol.data.DataCache<java.lang.String, com.github.kolandroid.kol.data.RawSkill> getSkillCache() {
    if (skillsCache.isLoadRequired()) {
        synchronized(skillsCache) {
            if (skillsCache.isLoadRequired()) {
                skillsCache.load(this);
            }
        }
    }
    return skillsCache;
}