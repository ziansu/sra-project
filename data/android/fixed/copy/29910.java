public br.com.avelar.wlws.data.WeatherData findLast() {
    java.util.List<br.com.avelar.wlws.data.WeatherData> all = dao.findAll();
    if (all.isEmpty())
        return null;
    
    return all.get(((all.size()) - 1));
}