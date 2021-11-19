public void translate(final java.lang.Double x, final java.lang.Double y) {
    runCommand(new com.google.gwt.user.client.Command() {
        @java.lang.Override
        public void execute() {
            ctx.translate(x, y);
        }
    });
}