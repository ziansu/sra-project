@org.springframework.web.bind.annotation.RequestMapping(value = "/tools", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<org.sagebionetworks.ga4gh.model.Tool> listTools() {
    java.util.List<org.sagebionetworks.ga4gh.model.Tool> tools = new java.util.ArrayList<org.sagebionetworks.ga4gh.model.Tool>();
    return tools;
}