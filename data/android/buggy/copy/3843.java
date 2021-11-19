public static java.lang.String error(java.lang.Integer status) {
    return new com.free.agent.Response<>(status).toJSON();
}