@java.lang.Override
protected org.springframework.http.HttpStatus getStatus(com.naturalprogrammer.spring.lemon.exceptions.MultiErrorException ex) {
    return org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;
}