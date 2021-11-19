@javax.annotation.PostConstruct
void init() {
    this.userGateway.find(currentUser.getName());
    java.lang.System.out.println(this.userGateway.getCurrent().getLogin());
}