@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        gs.saveProfilePicToParse(prepareProfilePicForSaving());
    }else {
    }
}