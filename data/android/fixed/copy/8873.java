public void notifyRunInBackground(com.wangjie.androidbucket.services.network.HippoResponse<T> response) {
    if (response.isSuccess()) {
        if ((listener) != null)
            listener.onResponseInBackground(response.getResult());
        
    }
}