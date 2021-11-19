@java.lang.Override
public void onPageSelected(int position) {
    switch (position) {
        case 0 :
            title.setText(R.string.title_myBook);
            break;
        case 1 :
            title.setText(R.string.title_allBook);
            break;
        default :
            title.setText(R.string.title_allBook);
            break;
    }
}