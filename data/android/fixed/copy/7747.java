@org.springframework.web.bind.annotation.RequestMapping(value = "/delete")
@org.springframework.web.bind.annotation.ResponseBody
public com.taotao.common.pojo.TaotaoResult deleteContentCategory(java.lang.Long id) {
    com.taotao.common.pojo.TaotaoResult result = contentCategoryService.deleteContentCategory(id);
    return result;
}