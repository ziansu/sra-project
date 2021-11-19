@org.springframework.web.bind.annotation.RequestMapping(value = "/find", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.codecool.volunti.model.Opportunity> findOpportunities() {
    log.info("opportunityRepository.findAll()");
    java.lang.System.out.println(("opportunityRepository = " + (opportunityRepository.findAll())));
    return ((java.util.List<com.codecool.volunti.model.Opportunity>) (opportunityRepository.findAll()));
}