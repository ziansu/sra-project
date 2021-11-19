@java.lang.Override
protected void onPostExecute(org.json.JSONArray jsonArrayOfMyNumbers) {
    java.util.ArrayList<com.example.fml24.fml24.Model.MyNumbers> myNumbers = AddMyNumbersToArrayList(jsonArrayOfMyNumbers);
    myNumbersAdaptor = new com.example.fml24.fml24.Adaptor.MyNumbersAdaptor(getActivity(), myNumbers);
    setListAdapter(myNumbersAdaptor);
}