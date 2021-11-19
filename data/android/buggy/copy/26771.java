private void populateList() {
    com.codepath.contact.models.Request.getRequestsInBackground(com.parse.ParseUser.getCurrentUser().getUsername(), new com.codepath.contact.models.Request.OnRequestsReturnedListener() {
        @java.lang.Override
        public void receiveRequests(java.util.List<com.codepath.contact.models.Request> requests) {
            requestsAdapter.addAll(requests);
        }
    });
}