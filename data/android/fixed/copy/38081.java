@com.jaeksoft.searchlib.webservice.crawler.webcrawler.GET
@com.jaeksoft.searchlib.webservice.crawler.webcrawler.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.APPLICATION_XML })
@com.jaeksoft.searchlib.webservice.crawler.webcrawler.Path(value = "/sitemap")
public com.jaeksoft.searchlib.webservice.CommonListResult<java.lang.String> getSiteMap(@com.jaeksoft.searchlib.webservice.crawler.webcrawler.PathParam(value = "index_name")
java.lang.String use, @com.jaeksoft.searchlib.webservice.crawler.webcrawler.QueryParam(value = "login")
java.lang.String login, @com.jaeksoft.searchlib.webservice.crawler.webcrawler.QueryParam(value = "key")
java.lang.String key);