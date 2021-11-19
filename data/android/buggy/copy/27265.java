@java.lang.Override
public java.lang.String save(javax.servlet.http.Part attachment) {
    return save((((media_path) + "/") + (attachment.getSubmittedFileName())), attachment);
}