@java.lang.Override
public java.lang.String toString() {
    return com.alibaba.fastjson.JSON.toJSONString(this).replace("\"id\"", "\"_id\"");
}