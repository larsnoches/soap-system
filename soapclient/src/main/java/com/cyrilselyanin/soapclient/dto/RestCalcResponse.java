package com.cyrilselyanin.soapclient.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Объект передачи данных ответа на REST-запрос
 * решения квадратного уравнения
 */
@Getter
@Setter
public class RestCalcResponse {
    private Integer discriminant;
    private List<Double> equationRoots;
    private String quadratic;
}
