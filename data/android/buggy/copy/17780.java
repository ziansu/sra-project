@java.lang.Override
public void run() {
    businesslayer.ScrapeYahooNewsComments scrapeYahooNewsComments = new businesslayer.ScrapeYahooNewsComments(url, maxComments);
    setPeople(scrapeYahooNewsComments.getPersons());
    for (businesslayer.Person person : people) {
        datalayer.DatabaseConnection.insertPerson(person);
    }
}