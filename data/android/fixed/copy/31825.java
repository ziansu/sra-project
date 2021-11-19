@org.springframework.context.annotation.Bean
public org.springframework.web.multipart.commons.CommonsMultipartResolver multipartResolver() throws org.springframework.web.multipart.MaxUploadSizeExceededException {
    org.springframework.web.multipart.commons.CommonsMultipartResolver commonsMultipartResolver = new org.springframework.web.multipart.commons.CommonsMultipartResolver();
    commonsMultipartResolver.setDefaultEncoding("utf-8");
    return commonsMultipartResolver;
}