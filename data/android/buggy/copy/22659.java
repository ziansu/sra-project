@asg.cliche.Command(description = "Get a Rating")
public java.lang.String getRating(@asg.cliche.Param(name = "movieID")
long movieID) {
    rating = moviAPI.getRating(movieID);
    return rating.toString();
}