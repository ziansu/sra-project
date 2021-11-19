@javax.annotation.PostConstruct
public void init() {
    currentUser = org.apache.shiro.SecurityUtils.getSubject();
}