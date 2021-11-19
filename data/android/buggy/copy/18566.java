private com.vaadin.navigator.View getAccessDeniedView() {
    if ((accessDeniedViewClass) != null) {
        return getWebApplicationContext().getBean(accessDeniedViewClass);
    }else {
        return null;
    }
}