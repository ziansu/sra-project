@org.springframework.web.bind.annotation.RequestMapping(value = "/vehicle-location-simulation!map.do", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView activeBlocksAndRecordsForTask(@org.springframework.web.bind.annotation.RequestParam
int taskId, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    return new org.springframework.web.servlet.ModelAndView("vehicle-location-simulation-map.jspx");
}