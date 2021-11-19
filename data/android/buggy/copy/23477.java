public com.dajia.vo.ProductVO loadProductDetail(java.lang.Long pid) {
    com.dajia.domain.Product product = productRepo.findOne(pid);
    if (null == product) {
        return null;
    }
    product.productImages.size();
    return convertProductVO(product);
}