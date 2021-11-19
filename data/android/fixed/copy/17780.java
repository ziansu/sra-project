@java.lang.Override
public void run() {
    businesslayer.ScrapeYahooNewsComments scrapeYahooNewsComments = new businesslayer.ScrapeYahooNewsComments(url, maxComments);
    setPeople(scrapeYahooNewsComments.getPersons());
    datalayer.DatabaseConnection.insertPerson(people);
}