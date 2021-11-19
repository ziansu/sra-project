@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
public pl.pamsoft.ebs.model.Person save(@javax.validation.Valid
@org.springframework.web.bind.annotation.RequestBody
pl.pamsoft.ebs.model.Person person) throws pl.pamsoft.ebs.error.BadRequestException {
    super.save(person);
    if (person.getGenerateRandomEntries()) {
        estimationServices.generateRandomEstimates(person);
    }
    return person;
}