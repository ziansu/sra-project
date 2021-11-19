@org.springframework.web.bind.annotation.RequestMapping(value = "/keywords")
public java.util.HashSet<uk.co.corbas.slides.model.Keyword> list() {
    return kws.listKeywords();
}