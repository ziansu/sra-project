@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/ajaxChooseProducts")
public java.lang.String ajaxChooseProducts(com.core.dao.Page<com.store.domain.product.ProductDO> page, java.lang.String condition, java.lang.String search, org.springframework.ui.Model model) throws com.core.web.freemarker.FreemarkerParseException {
    listChooseModel(page, condition, search, model);
    return jsonResponseView("/store/product/choose/products", model);
}