@org.springframework.web.bind.annotation.RequestMapping(value = "/admin/editproduct", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String editProductAndToIndex(@org.springframework.web.bind.annotation.ModelAttribute(value = "product")
Fiatskovich.viewmodelFiatskovich.ProductViewModel product) {
    product.setName(new java.lang.String(product.getName().getBytes(), java.nio.charset.StandardCharsets.ISO_8859_1));
    productService.editProduct(product);
    return "redirect:/admin/index";
}