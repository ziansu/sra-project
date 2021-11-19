@java.lang.Override
public void onSeasonLoaded(tw.invictus.tventhusiast.model.pojo.Season season) {
    recyclerView.setAdapter(new tw.invictus.tventhusiast.view.adapter.EpisodeRecyclerViewAdapter(this, season, lightColor, isShowInDb));
}