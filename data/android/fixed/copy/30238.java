public org.springframework.ide.eclipse.boot.dash.cloudfoundry.client.v2.CFRouteBuilder host(java.lang.String host) {
    this.host = host;
    this.fullRoute = org.springframework.ide.eclipse.boot.dash.cloudfoundry.client.v2.CFRouteBuilder.buildRouteVal(this.host, this.domain, this.path, this.port);
    return this;
}