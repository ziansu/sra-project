@javax.annotation.PreDestroy
public void closeResourceResolver() {
    if (((this.resolver) != null) && (this.resolver.isLive())) {
        this.resolver.close();
    }
}