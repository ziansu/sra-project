@org.springframework.web.bind.annotation.RequestMapping(value = "/productInventory/addProduct", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addProductPost(kr.ac.hansung.cse.model.Product product) {
    if (!(productService.addProduct(product))) {
        java.lang.System.out.println("Adding product cannot be done");
    }
    java.lang.System.out.println(("Controller addProductPost: " + (product.getName())));
    return "redirect:/admin/productInventory";
}