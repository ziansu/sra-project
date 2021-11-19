private void setFragment() {
    fragmentTransaction = fragmentManager.beginTransaction();
    allSportsFragment.nytAllSportsNews();
    fragmentTransaction.add(R.id.frag_container, allSportsFragment);
    fragmentTransaction.commit();
}