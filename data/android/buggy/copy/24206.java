@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = "versionDetail/{documentVersionId}")
public org.blub.domain.Document getOneVersion(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long documentVersionId) {
    return documentRepository.findOne(documentVersionId);
}