package com.aaron.practice_simplefactory;

import java.util.Map;

abstract class Chart {
    public void setData(Map<String, Float> data) {
        // do something same
    }

    public abstract void showChart();
}