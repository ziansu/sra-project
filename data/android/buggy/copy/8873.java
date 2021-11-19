public void notifyRunInBackground(com.wangjie.androidbucket.services.network.HippoResponse<T> response) {
    if (response.isSuccess()) {
        listener.onResponseInBackground(response.getResult());
    }
}