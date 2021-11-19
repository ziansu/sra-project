@java.lang.Override
protected void onPostExecute(example.normeow.sunshine.DayWeather[] result) {
    if (result != null) {
        adapter.clear();
        for (example.normeow.sunshine.DayWeather i : result)
            adapter.add(i);
        
    }
}