public static void main(java.lang.String[] args) throws java.io.IOException {
    zxl.redis.Cluster c = new zxl.redis.Cluster();
    zxl.bean.User zxl = new zxl.bean.User("zhengxiaolin", "123", 20);
    c.add_a_user(zxl);
    c.get_all_keys();
}