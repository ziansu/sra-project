@com.webshop.controller.RequestMapping(value = "categories/add", method = RequestMethod.GET)
@com.webshop.controller.ResponseBody
public java.lang.String addCategory(@com.webshop.controller.ModelAttribute(value = "category")
com.webshop.model.product.Category category) {
    if (!(category.getCategoryName().isEmpty()))
        categoryService.saveCategory(category);
    
    return "odpowiedz";
}