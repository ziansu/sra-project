public void setRefreshing(final boolean refreshing) {
    view.getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            layout.setRefreshing(refreshing);
        }
    });
}