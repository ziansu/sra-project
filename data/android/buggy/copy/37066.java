@org.springframework.web.bind.annotation.RequestMapping(value = "/addCandidateInfo2", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addCandidateInfo2(ua.com.jobsukraine.entity.Candidate candidate) {
    java.lang.System.out.println(candidate);
    return "regcandidate/RegCandidateThree";
}