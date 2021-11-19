@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.util.Log.i("Frag_position", ("" + position));
    edu.temple.markopromo.DisplayMessageActivity.filename = filelist.get(position);
    return edu.temple.markopromo.MessageFragment.create(position, filelist.get(position));
}