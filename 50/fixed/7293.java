public void set(org.nutz.dao.entity.Entity<?> en) {
    synchronized(map) {
        this.map.put(en.getType(), en);
    }
}