@org.springframework.web.bind.annotation.RequestMapping(value = "/api/setPrefix")
public boolean setPrefix(@org.springframework.web.bind.annotation.RequestParam(value = "prefix")
java.lang.String prefix) {
    try {
        puzzlePageService.setPrefix(prefix);
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}