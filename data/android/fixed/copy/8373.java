@java.lang.Override
public void onClick(android.view.View view) {
    spinner.setVisibility(View.VISIBLE);
    new com.udacity.gradle.builditbigger.JokeEndpointsAsyncTask().execute(new android.support.v4.util.Pair<android.content.Context, java.lang.Integer>(getContext(), (-1)));
}