@com.github.olegbal.urlshortingtool.controllers.RequestMapping(path = "/check", params = "url", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity checkLink(@com.github.olegbal.urlshortingtool.controllers.RequestParam(value = "url")
java.lang.String url) {
    com.github.olegbal.urlshortingtool.domain.dto.LinkDto link = linkService.getByOriginalLink(url);
    if (link != null) {
        return new org.springframework.http.ResponseEntity(link, org.springframework.http.HttpStatus.CONFLICT);
    }
    return new org.springframework.http.ResponseEntity(link.shortLink, org.springframework.http.HttpStatus.OK);
}