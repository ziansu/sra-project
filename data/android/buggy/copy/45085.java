public static void majTheme(android.content.Context context) {
    int theme = fr.ybo.transportsrennes.application.TransportsRennesApplication.getTheme(context);
    switch (theme) {
        case 1 :
            context.setTheme(R.style.Theme_TransportsRennes_black);
            break;
        default :
            context.setTheme(R.style.Theme_TransportsRennes);
            break;
    }
}