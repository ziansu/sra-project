@java.lang.Override
public ua.olejnik.domain.Weather getCurrentWeather(java.lang.String city) throws java.io.IOException, org.json.simple.parser.ParseException {
    if (!(validate(city))) {
        throw new org.json.simple.parser.ParseException(0, city);
    }
    return getWeatherFromJson(getJsonFromServer(city));
}