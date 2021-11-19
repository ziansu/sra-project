public static boolean isInputMatch(org.rapidcontext.core.web.Request request, java.lang.String[] mimes) {
    return org.rapidcontext.core.web.Mime.isMatch(request.getContentType(), mimes);
}