@org.springframework.web.bind.annotation.RequestMapping(value = "comment", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String submitHomeComment(@org.springframework.web.bind.annotation.ModelAttribute
com.illuxplain.app.Comments comment) {
    java.lang.String commentText = comment.getCommentText();
    java.lang.String commentorName = comment.getNameOfCommentor();
    java.lang.System.out.println(("######################################### " + commentText));
    return "OK";
}