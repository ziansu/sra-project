public ro.pippo.core.Response status(int status) {
    checkCommitted();
    httpServletResponse.setStatus(status);
    return this;
}