@org.springframework.web.bind.annotation.RequestMapping(value = "/saveProductDetails", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Long saveProductDetails(@javax.validation.Valid
com.webapp.project.modules.product.model.ProductDetails productDetails, org.springframework.validation.BindingResult result, org.springframework.ui.ModelMap model) {
    model.addAttribute("productDetails", productDetails);
    productDetails.setPdtId(0);
    java.lang.Long productDetailsId = productService.saveProductDetails(productDetails);
    return productDetailsId;
}