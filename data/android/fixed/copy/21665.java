public static com.contentful.java.cda.interceptor.ContentfulUserAgentHeaderInterceptor.Section app(java.lang.String name, com.contentful.java.cda.interceptor.ContentfulUserAgentHeaderInterceptor.Section.Version version) {
    name = com.contentful.java.cda.interceptor.ContentfulUserAgentHeaderInterceptor.Section.check(name);
    if (name == null) {
        return null;
    }else {
        return new com.contentful.java.cda.interceptor.ContentfulUserAgentHeaderInterceptor.Section(com.contentful.java.cda.interceptor.ContentfulUserAgentHeaderInterceptor.Section.APP, name, version);
    }
}