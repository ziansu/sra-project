private void refreshDetailsFragment(com.example.test.samplemasterdetail.entities.RelatedTopic relatedTopic) {
    if ((mDetailsFragment) != null) {
        mDetailsFragment.refreshDetails(relatedTopic);
    }
}