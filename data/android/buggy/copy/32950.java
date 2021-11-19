@org.springframework.web.bind.annotation.RequestMapping(value = "/test", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String examplePost(@org.springframework.web.bind.annotation.RequestParam(value = "x", required = false)
java.lang.Integer x, @org.springframework.web.bind.annotation.RequestParam(value = "y", required = false)
java.lang.Integer y) {
    java.lang.String result = "Invalid format";
    if ((x != null) && (y != null))
        result = "" + (x + y);
    
    return ("<p>" + result) + "</p>";
}