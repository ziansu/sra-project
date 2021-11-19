@org.springframework.web.bind.annotation.RequestMapping(value = "/releaseSchedule", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String releaseSchedule(@org.springframework.web.bind.annotation.RequestBody
java.util.ArrayList<java.lang.String> inputs) {
    com.example.ReleaseSchedule rs = new com.example.ReleaseSchedule(inputs);
    return rs.getTimeGap();
}