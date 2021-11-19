@org.springframework.web.bind.annotation.RequestMapping(value = "/util/tokens/framework", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<nl.zoostation.database.model.input.SearchToken> getFrameworkTokens(@org.springframework.web.bind.annotation.RequestParam(value = "q")
java.lang.String searchTerm, @org.springframework.web.bind.annotation.RequestParam(value = "l", required = false)
java.lang.Integer[] relatedProgrammingLanguageIds) {
    return frameworkTokenService.findTokens(searchTerm, java.util.Collections.singletonMap(nl.zoostation.database.app.Constants.Parameters.LANGUAGE_IDS, java.util.Arrays.asList(relatedProgrammingLanguageIds)));
}