package com.cyrilselyanin.soapws.service;

import com.cyrilselyanin.soapws.service.dto.CalcSolution;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://cyrilselyanin.com/service/soap-ws")
public interface FormulaService {
    /**
     * Решение уравнения
     * @param a Коэффициент 1
     * @param b Коэффициент 2
     * @param c Свободный член
     * @return Решение
     */
    @WebMethod
    CalcSolution calc(Integer a, Integer b, Integer c);

    /**
     * Получение строки уравнения
     * @param a Коэффициент 1
     * @param b Коэффициент 2
     * @param c Свободный член
     * @return Значение строки уравнения
     */
    String quadratic(Double a, Double b, Double c);

    /**
     * Получение дискриминанта
     * @param a Коэффициент 1
     * @param b Коэффициент 2
     * @param c Свободный член
     * @return Значение дискриминанта
     */
    Double discriminant(Double a, Double b, Double c);

    /**
     * Вычисление корней
     * @param a Коэффициент 1
     * @param b Коэффициент 2
     * @param d Дискримимант
     * @return Список корней уравнения
     */
    List<Double> equationRoots(Double a, Double b, Double c, Double d);
}
