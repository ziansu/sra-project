public synchronized void setResponse(int questionNumber, java.lang.String response) {
    android.util.Log.e("RESPONSE", ((("to question #: " + questionNumber) + " setting response: ") + response));
    thisSectionsQuestions.get(questionNumber).setResponseText(response);
}