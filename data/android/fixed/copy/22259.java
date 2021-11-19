@org.springframework.web.bind.annotation.RequestMapping(value = "/categories", method = org.springframework.web.bind.annotation.RequestMethod.GET, headers = "Accept=application/json")
public com.duttyapps.storerestful.bean.Categories getCategories() {
    com.duttyapps.storerestful.bean.Categories cat = categoryService.getCategories();
    return cat;
}