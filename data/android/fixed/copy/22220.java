public void onRideAccepted() {
    handler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            notificationHeader.setVisibility(View.GONE);
            finishRideHeader.setVisibility(View.VISIBLE);
        }
    });
}