@com.linoge.controllers.rest.RequestMapping(path = "/getarticlesbypage", method = RequestMethod.GET)
public java.util.List<com.linoge.models.dto.ArticleDTO> getArticlesByPage(@com.linoge.controllers.rest.RequestParam(value = "number")
java.lang.Integer number) {
    return com.linoge.models.converters.ArticleConverter.convertArticleCollectionToDTO(articleService.getArticlesByPage(number));
}