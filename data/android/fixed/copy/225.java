@java.lang.Override
public void run() {
    adapter = new com.example.yamin.jsontest.adapter.NewsAdapter(com.example.yamin.jsontest.JsonDate.newsList);
    recyclerView.setAdapter(adapter);
}