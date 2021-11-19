public java.lang.String getScheduler(long skuId) {
    for (cn.momia.api.course.dto.CourseSku sku : skus) {
        if ((sku.getId()) == skuId)
            return sku.getScheduler();
        
    }
    return "";
}