@java.lang.Override
public java.lang.String performBaseAction(com.user.UserBean userBean, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.util.Map<java.lang.String, java.lang.Object> session) {
    if ((marks) >= (passingMarks)) {
        message = "Passed";
    }else {
        message = "Failed";
    }
    return SUCCESS;
}