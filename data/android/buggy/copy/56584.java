public java.lang.String getCommentEscaped() {
    java.lang.String comment = this.getComment();
    comment = org.apache.commons.lang.StringEscapeUtils.escapeHtml(comment);
    comment = comment.replaceAll("\n", "<br>");
    return comment;
}