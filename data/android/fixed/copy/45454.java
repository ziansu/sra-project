@org.springframework.web.bind.annotation.RequestMapping(value = "/addCandidateInfo", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addCandidateInfo(@org.springframework.web.bind.annotation.ModelAttribute(value = "candidate")
ua.com.jobsukraine.entity.Candidate candidate) {
    return "regcandidate/RegCandidateTwo";
}