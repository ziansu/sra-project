@org.springframework.web.bind.annotation.RequestMapping(value = "/external-services/genome-browser/{genomeBrowserName}", method = { org.springframework.web.bind.annotation.RequestMethod.GET , org.springframework.web.bind.annotation.RequestMethod.HEAD })
public java.lang.String redirectToGenomeBrowserPreviousUrl(@org.springframework.web.bind.annotation.PathVariable
java.lang.String genomeBrowserName, @org.springframework.web.bind.annotation.RequestParam
java.lang.String experimentAccession, @org.springframework.web.bind.annotation.RequestParam
java.lang.String geneId, @org.springframework.web.bind.annotation.RequestParam(required = false, defaultValue = "")
java.lang.String trackId, @org.springframework.web.bind.annotation.RequestParam(required = false, defaultValue = "")
java.lang.String accessKey, javax.servlet.http.HttpServletRequest request) throws java.io.IOException {
    return redirectToGenomeBrowser(genomeBrowserName, experimentAccession, geneId, trackId, accessKey, request);
}