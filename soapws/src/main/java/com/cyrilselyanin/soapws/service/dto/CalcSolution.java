package com.cyrilselyanin.soapws.service.dto;

import java.util.List;

/**
 * Объект передачи данных решения от SOAP-сервиса
 */
public class CalcSolution {
    private Integer discriminant;
    private List<Double> equationRoots;
    private String quadratic;

    public Integer getDiscriminant() {
        return discriminant;
    }

    public void setDiscriminant(Integer discriminant) {
        this.discriminant = discriminant;
    }

    public List<Double> getEquationRoots() {
        return equationRoots;
    }

    public void setEquationRoots(List<Double> equationRoots) {
        this.equationRoots = equationRoots;
    }

    public String getQuadratic() {
        return quadratic;
    }

    public void setQuadratic(String quadratic) {
        this.quadratic = quadratic;
    }
}
