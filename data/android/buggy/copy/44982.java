@java.lang.Override
public void onResult(java.util.List<com.example.nofarcohenzedek.dogo.Model.DogOwner> dogOwners) {
    for (com.example.nofarcohenzedek.dogo.Model.DogOwner dogOwner : dogOwners) {
        data.add(dogOwner);
        com.example.nofarcohenzedek.dogo.MessagesActivity.MessagesAdapter adapter = new com.example.nofarcohenzedek.dogo.MessagesActivity.MessagesAdapter();
        list.setAdapter(adapter);
        progressBar.setVisibility(View.GONE);
    }
}