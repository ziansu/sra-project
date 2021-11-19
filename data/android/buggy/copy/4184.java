@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e != null)
        android.util.Log.d("Object saving error", e.toString());
    
    java.lang.System.out.println(("New upvote count: " + (object.getNumber("upvotes"))));
    java.lang.System.out.println("Post updated");
}