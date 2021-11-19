private com.vaadin.navigator.View getAccessDeniedView() {
    if ((accessDeniedViewClass) != null) {
        return applicationContext.getBean(accessDeniedViewClass);
    }else {
        return null;
    }
}