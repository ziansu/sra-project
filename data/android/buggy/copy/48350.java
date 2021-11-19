private void setFloatingButtonEdge(java.lang.String edge) {
    if ("left".equals(edge)) {
        builder.setFloatingButtonEdge(InstabugFloatingButtonEdge.LEFT);
    }else
        if ("right".equals(edge)) {
            builder.setFloatingButtonEdge(InstabugFloatingButtonEdge.RIGHT);
        }
    
}