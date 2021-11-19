public static void setFist(boolean b) {
    com.google.firebase.database.DatabaseReference ref = com.google.firebase.database.FirebaseDatabase.getInstance().getReference("").child("fist");
    ref.setValue("hi ethan :)");
}