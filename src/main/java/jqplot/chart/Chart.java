/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import jqplot.chart.config.ChartConfiguration;
import jqplot.chart.data.ChartData;

/**
 *
 * @author inaiat
 */
public interface Chart<T extends ChartData> {
    
    ChartConfiguration getChartConfiguration();
    T getChartData();
    void setChartData(T value);
}