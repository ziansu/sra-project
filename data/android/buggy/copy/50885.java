@org.springframework.web.bind.annotation.RequestMapping(path = "/api/{type}/{userId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.paypal.dealbridge.storage.domain.BriefDiscount> getTypeDiscounts(@org.springframework.web.bind.annotation.PathVariable(value = "userId")
int userId, @org.springframework.web.bind.annotation.PathVariable(value = "type")
java.lang.String type, @org.springframework.web.bind.annotation.RequestParam(value = "startIndex", required = false)
java.lang.Integer start, @org.springframework.web.bind.annotation.RequestParam(value = "limitNumber", required = false)
java.lang.Integer number) throws com.paypal.dealbridge.service.recommend.RecommendQueryException, java.io.UnsupportedEncodingException, java.text.ParseException, org.json.JSONException {
    return recommendService.getDiscountByType(userId, start, number, type);
}