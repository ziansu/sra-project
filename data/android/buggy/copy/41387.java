@java.lang.Override
public void done(java.util.List<com.parse.ParseObject> objects, com.parse.ParseException e) {
    for (com.parse.ParseObject lan : objects)
        new com.example.emile1.findaparty.Activity.fragment.SearchFragment.GetLocationFromAddressTask().execute(addressToString(lan.getJSONObject("address")));
    
}