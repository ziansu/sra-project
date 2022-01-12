private void publishResults(com.example.mappingservice.Result result) {
    android.content.Intent intent = new android.content.Intent(com.example.mappingservice.MappingService.NOTIFICATION);
    intent.putExtra("result", result);
    sendBroadcast(intent);
}