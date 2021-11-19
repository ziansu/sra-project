@resources.POST
@resources.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public void addResearcher(models.Researcher researcher) throws java.lang.Exception {
    researcherService.addResearcher(researcher);
}