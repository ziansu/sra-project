private void submitFoundItem(java.util.Date dateTime) {
    newItem = new com.example.mcw0805.wheres_my_stuff.Model.FoundItem(inputName, inputDescription, dateTime, inputLongitude, inputLatitude, inputItemCategory, uid);
    newItem.writeToDatabase(com.example.mcw0805.wheres_my_stuff.Model.FoundItem.getChildRef());
    incrementSubmissionCount();
}