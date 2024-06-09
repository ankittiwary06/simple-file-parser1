package com.hicx;

public class DataAnalyzer {
 DataSourceManager data;
 AnalyticsStrategy analyticsStrategy;

    public DataAnalyzer(DataSourceManager data, AnalyticsStrategy analyticsStrategy) {
        this.data = data;
        this.analyticsStrategy = analyticsStrategy;

    }
 public String runAnalysis(){
        return analyticsStrategy.analysis(data.getData());
 }

}
