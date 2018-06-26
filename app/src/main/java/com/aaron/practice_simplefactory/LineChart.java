package com.aaron.practice_simplefactory;

import java.util.Map;

// 線形圖
public class LineChart extends Chart {
    @Override
    public void setData(Map<String, Float> data) {
        super.setData(data);
    }

    @Override
    public void showChart() {
        // do something
        System.out.println("看到這句話就假裝看到了折線圖 ^^!");
    }
}