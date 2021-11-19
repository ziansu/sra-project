protected void fetchData() {
    java.lang.String url = plexFactory.getSeasonsURL(key);
    us.nineworlds.serenity.jobs.SeasonsRetrievalJob seasonsRetrievalJob = new us.nineworlds.serenity.jobs.SeasonsRetrievalJob(key);
    jobManager.addJobInBackground(seasonsRetrievalJob);
}