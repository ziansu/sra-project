@java.lang.Override
public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
    this.urlMapping = new com.yxz.mySimpleMVC.urlMapping.DefaultUrlMapping();
    this.urlMapping.init();
}