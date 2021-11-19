@org.springframework.web.bind.annotation.RequestMapping(value = "/regCandidateNew", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String register(ua.com.jobsukraine.entity.Candidate candidate, org.springframework.validation.BindingResult result) {
    java.lang.System.out.println(candidate);
    java.lang.System.out.println(candidate.getInfo().toString());
    cs.add(candidate);
    return "welcome";
}