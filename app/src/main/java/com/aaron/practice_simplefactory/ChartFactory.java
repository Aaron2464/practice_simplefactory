package com.aaron.practice_simplefactory;

public class ChartFactory {
    public static final int FLAG_LINE_CHART = 0;
    public static final int FLAG_PIE_CHART = 1;
    public static final int FLAG_HISTOGRAM_CHART = 2;

    public static Chart getChart(int flag) {
        switch (flag) {
            case FLAG_LINE_CHART:
                return new LineChart();
            case FLAG_PIE_CHART:
                return new PieChart();
            case FLAG_HISTOGRAM_CHART:
                return new Histogram();
            default:
                return null;
        }
    }
}
