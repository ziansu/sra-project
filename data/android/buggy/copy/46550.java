public void fetchSubtitle(us.nineworlds.serenity.core.model.VideoContentInfo mpi) {
    jobManager.addJobInBackground(new us.nineworlds.serenity.jobs.SubtitleJob(("/library/metadata/" + (mpi.id()))));
}