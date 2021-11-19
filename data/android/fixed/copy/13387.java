private static redis.clients.jedis.Jedis getIstance() throws java.lang.Exception {
    if ((it.datatoknowledge.pbdmng.urlShortener.dao.jedis.DAOJedis.pool) == null) {
        it.datatoknowledge.pbdmng.urlShortener.dao.jedis.DAOJedis.pool = new redis.clients.jedis.JedisPool();
    }
    return it.datatoknowledge.pbdmng.urlShortener.dao.jedis.DAOJedis.pool.getResource();
}