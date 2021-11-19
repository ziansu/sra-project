@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        return new com.codepath.apps.restclienttemplate.fragment.HomeTimelineFragment();
    }else
        if (position == 1) {
            return new com.codepath.apps.restclienttemplate.fragment.MentionsTimelineFragment();
        }else {
            return null;
        }
    
}