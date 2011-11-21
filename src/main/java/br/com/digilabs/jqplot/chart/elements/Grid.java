/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.chart.elements;

import br.com.digilabs.jqplot.axis.Axis;

/**
 *
 * @author bernardo.moura
 */
public class Grid implements Element {

    private static final long serialVersionUID = 5478580499167992682L;
    private Boolean drawGridLines;
    private String gridLineColer;
    private Double gridLineWidth;
    private String background;
    private String borderColor;
    private Double borderWidth;
    private Boolean drawBorder;
    private Boolean shadow;
    private Double shadowAngle;
    private Double shadowOffset;
    private Double shadowWidth;
    private Double shadowDepth;
    private String shadowColor;
    private String shadowAlpha;
    private Float left;
    private Float top;
    private Float right;
    private Float bottom;
    private Float width;
    private Float height;
    private Axis[] axis;
    private String[] rendererOptions;

    public Axis[] getAxis() {
        return axis;
    }

    public void setAxis(Axis[] axis) {
        this.axis = axis;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public Double getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Double borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Float getBottom() {
        return bottom;
    }

    public void setBottom(Float bottom) {
        this.bottom = bottom;
    }

    public Boolean getDrawBorder() {
        return drawBorder;
    }

    public void setDrawBorder(Boolean drawBorder) {
        this.drawBorder = drawBorder;
    }

    public Boolean getDrawGridLines() {
        return drawGridLines;
    }

    public void setDrawGridLines(Boolean drawGridLines) {
        this.drawGridLines = drawGridLines;
    }

    public String getGridLineColer() {
        return gridLineColer;
    }

    public void setGridLineColer(String gridLineColer) {
        this.gridLineColer = gridLineColer;
    }

    public Double getGridLineWidth() {
        return gridLineWidth;
    }

    public void setGridLineWidth(Double gridLineWidth) {
        this.gridLineWidth = gridLineWidth;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getLeft() {
        return left;
    }

    public void setLeft(Float left) {
        this.left = left;
    }

    public String[] getRendererOptions() {
        return rendererOptions;
    }

    public void setRendererOptions(String[] rendererOptions) {
        this.rendererOptions = rendererOptions;
    }

    public Float getRight() {
        return right;
    }

    public void setRight(Float right) {
        this.right = right;
    }

    public Boolean getShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }

    public String getShadowAlpha() {
        return shadowAlpha;
    }

    public void setShadowAlpha(String shadowAlpha) {
        this.shadowAlpha = shadowAlpha;
    }

    public Double getShadowAngle() {
        return shadowAngle;
    }

    public void setShadowAngle(Double shadowAngle) {
        this.shadowAngle = shadowAngle;
    }

    public String getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
    }

    public Double getShadowDepth() {
        return shadowDepth;
    }

    public void setShadowDepth(Double shadowDepth) {
        this.shadowDepth = shadowDepth;
    }

    public Double getShadowOffset() {
        return shadowOffset;
    }

    public void setShadowOffset(Double shadowOffset) {
        this.shadowOffset = shadowOffset;
    }

    public Double getShadowWidth() {
        return shadowWidth;
    }

    public void setShadowWidth(Double shadowWidth) {
        this.shadowWidth = shadowWidth;
    }

    public Float getTop() {
        return top;
    }

    public void setTop(Float top) {
        this.top = top;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }
}
