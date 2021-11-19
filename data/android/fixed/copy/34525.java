@java.lang.Override
public boolean retry(java.lang.Throwable e) {
    if ((e instanceof org.springframework.web.client.ResourceAccessException) || (e instanceof org.springframework.web.client.HttpServerErrorException)) {
        return true;
    }
    return false;
}