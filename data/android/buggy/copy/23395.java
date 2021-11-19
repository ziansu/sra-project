@java.lang.Override
public void onResponse(java.lang.String response) {
    com.github.javierugarte.ContributionsProvider provider = new com.github.javierugarte.ContributionsProvider();
    List<com.github.javierugarte.ContributionsDay> contributions = provider.getContributions(response, lastWeeks);
    listener.onResponse(contributions);
}