private static void setFilter(com.alibaba.fastjson.serializer.JSONSerializer serializer, com.alibaba.fastjson.serializer.SerializeFilter[] filters) {
    if (filters == null) {
        return ;
    }
    for (com.alibaba.fastjson.serializer.SerializeFilter filter : filters) {
        com.alibaba.fastjson.JSON.setFilter(serializer, filter);
    }
}