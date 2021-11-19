@org.springframework.web.bind.annotation.CrossOrigin
@org.springframework.web.bind.annotation.GetMapping
public java.util.List<org.icgc.dcc.submission.dictionary.model.Dictionary> getDictionary() {
    log.debug("Getting dictionaries");
    java.util.List<org.icgc.dcc.submission.dictionary.model.Dictionary> dictionaries = dictionaryService.getDictionaries();
    if (dictionaries == null) {
        dictionaries = com.google.common.collect.Lists.newArrayList();
    }
    return dictionaries;
}