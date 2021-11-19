public void run() {
    applyToChildren(new com.artifex.mupdfdemo.ReaderView.ViewMapper() {
        @java.lang.Override
        public void applyToView(android.view.View view) {
            ((com.artifex.mupdfdemo.MuPDFView) (view)).update();
        }
    });
}