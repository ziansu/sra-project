@de.escalon.hypermedia.action.Action(value = "ReviewAction")
@org.springframework.web.bind.annotation.RequestMapping(params = "searchTerms", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<java.lang.Object> queryReviewsRated(@org.springframework.web.bind.annotation.RequestParam
@de.escalon.hypermedia.action.Select(value = { "excellent" , "mediocre" , "abysmal" })
java.util.List<java.lang.String> searchTerms) {
    return null;
}