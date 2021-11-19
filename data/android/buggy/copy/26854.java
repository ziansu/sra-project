@org.springframework.web.bind.annotation.RequestMapping(value = "/validate/{id}")
public void validate(@org.springframework.web.bind.annotation.PathVariable
java.lang.String id) throws com.att.datalake.ict.store.exceptions.ICTStoreValidationException, java.lang.InterruptedException {
    com.att.datalake.ict.store.model.Source source = repository.findOne(id);
    if (!(source.validate(true))) {
        throw new com.att.datalake.ict.store.exceptions.ICTStoreValidationException("source not valid");
    }
}