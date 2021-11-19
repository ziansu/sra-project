@org.springframework.web.bind.annotation.RequestMapping(value = "/settingWebsite/products", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addProduct(@org.springframework.web.bind.annotation.ModelAttribute(value = com.shop.svitnagorod.controller.AdminController.PRODUCTS)
com.shop.svitnagorod.DTO.ProductDTO productDTO) {
    java.lang.System.out.println("Product are saving ...............");
    productService.save(productDTO);
    return "redirect:/admin/settingWebsite/products";
}