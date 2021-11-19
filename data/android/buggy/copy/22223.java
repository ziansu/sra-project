@org.springframework.web.bind.annotation.RequestMapping(value = "/{loc}")
public java.lang.String indexWithLocale(@org.springframework.web.bind.annotation.PathVariable(name = "loc")
java.lang.String loc) {
    if (!(isLocale(loc))) {
        throw new java.lang.IllegalStateException("Wrong path");
    }
    return ("redirect:/" + loc) + "/input";
}