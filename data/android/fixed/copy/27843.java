@org.springframework.web.bind.annotation.RequestMapping(value = "/saveProductDetails", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Long saveProductDetails(@org.springframework.web.bind.annotation.RequestBody
com.webapp.project.modules.product.model.ProductDetails productDetails) {
    productDetails.setPdtId(0);
    java.lang.Long productDetailsId = productService.saveProductDetails(productDetails);
    return productDetailsId;
}