@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
java.lang.String createTag(@org.springframework.web.bind.annotation.RequestBody
viewer.model.Tag tag) {
    tagService.createTag(tag.getTitle());
    return "";
}