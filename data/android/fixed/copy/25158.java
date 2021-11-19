@java.lang.SuppressWarnings(value = "unchecked")
public static <T> T getRequiredBean(javax.servlet.http.HttpServletRequest request, java.lang.String beanName) {
    javax.servlet.http.HttpSession session = request.getSession();
    return ((T) (com.feilong.spring.web.util.WebSpringUtil.getRequiredBean(session, beanName)));
}