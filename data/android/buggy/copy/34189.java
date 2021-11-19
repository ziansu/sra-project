@org.springframework.web.bind.annotation.RequestMapping(value = { "/outStock" })
public org.springframework.web.servlet.ModelAndView outStock(com.fh.entity.Page page) {
    org.springframework.web.servlet.ModelAndView rs = null;
    try {
        rs = listEnterStock(page, "out");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return rs;
}