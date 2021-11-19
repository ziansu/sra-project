public void initPager(java.util.List<me.alwx.places.data.models.Place> placeList) {
    binding.pager.setAdapter(adapter);
    adapter.setPlaceList(placeList);
}