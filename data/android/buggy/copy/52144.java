@org.springframework.web.bind.annotation.ExceptionHandler(value = org.springframework.web.servlet.NoHandlerFoundException.class)
public java.lang.String notFound(java.lang.Exception exception) {
    java.lang.System.out.println("----Caught 111KeywordNotFoundException----");
    java.lang.System.out.println(exception.printStackTrace());
    return "404Error";
}