@org.springframework.web.bind.annotation.GetMapping(value = "{id}")
public com.libertymutual.goforcode.wimp.models.Movie getOne(@org.springframework.web.bind.annotation.PathVariable
long id) throws com.libertymutual.goforcode.wimp.api.StuffNotFoundException {
    com.libertymutual.goforcode.wimp.models.Movie movie = movieRepo.findOne(id);
    if (movie == null) {
        return movieRepo.findOne(id);
    }
    return movie;
}