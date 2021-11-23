@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/info")
public org.cloudfoundry.samples.music.domain.ApplicationInfo info() {
    return new org.cloudfoundry.samples.music.domain.ApplicationInfo(springEnvironment.getActiveProfiles(), getServiceNames());
}