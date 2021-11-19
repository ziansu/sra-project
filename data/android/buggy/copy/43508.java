@java.lang.Override
public void setRefreshing(final boolean refreshing) {
    getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            binding.swipeRefresh.setRefreshing(refreshing);
        }
    });
}