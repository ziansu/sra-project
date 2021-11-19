public static void main(java.lang.String[] args) {
    zxl.bean.User zxl = new zxl.bean.User("zhengxiaolin", "123", 20);
    zxl.redis.Cluster.add_a_user(zxl);
    zxl.redis.Cluster.get_all_keys();
}