public zina_eliran.app.BusinessEntities.BEBaseEntity getObject() {
    if (!(objects.isEmpty()))
        return objects.get(0);
    
    return null;
}