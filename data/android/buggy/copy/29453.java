public void cancel() {
    if ((context) != null) {
        context.getCancellationHandler().cancel();
    }
}