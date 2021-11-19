public <T> java.util.List<T> getIndicatorInfos() {
    return com.alibaba.fastjson.JSON.parseObject(this.indicatorInfos, new com.alibaba.fastjson.TypeReference<java.util.List<T>>() {    });
}