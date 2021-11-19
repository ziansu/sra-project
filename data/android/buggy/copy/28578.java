@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public java.util.List<lt.javainiai.model.CandidatesResultsRatingEntity> findAll() {
    return this.candidatesResultsService.findAll();
}