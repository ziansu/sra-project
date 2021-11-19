@org.springframework.scheduling.annotation.Async
@org.springframework.web.bind.annotation.RequestMapping(value = "/get/{workerId}", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public hu.unideb.worktime.api.model.profile.ProfileRecord getProfile(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer workerId) {
    hu.unideb.worktime.api.model.profile.ProfileRecord result = null;
    this.logger.info("Calling /rest/profile/v1/get webservice with the following key: {}", workerId);
    result = this.sqlCallProfile.getProfileData(workerId);
    this.logger.info("Result of /rest/profile/v1/get webservice: {}", result);
    return result;
}