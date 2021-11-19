public java.lang.String getResponseParamType(cn.ytxu.http_wrapper.model.response.OutputParamModel output) {
    return getParamTypeBean(output.getType().name()).getResponseParamType(output);
}