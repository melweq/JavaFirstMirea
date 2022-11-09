package ru.mirea.task6;

class MyListener implements OnStringBuilderChangeListener {
    public void onChange(OvservableStringBuilder stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}
