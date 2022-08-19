package com.cyrilselyanin.soapws.service;

import com.cyrilselyanin.soapws.service.dto.CalcSolution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FormulaServiceImplTest {

    @Test
    void quadratic_andPositiveEquals() {
        FormulaServiceImpl formulaService = new FormulaServiceImpl();
        String what = "3X^2+5X+6=0";
        String s = formulaService.quadratic(3.0, 5.0, 6.0);
        assertEquals(what, s);
    }

    @Test
    void quadratic_andNegativeEquals() {
        FormulaServiceImpl formulaService = new FormulaServiceImpl();
        String what = "(-3)X^2+(-5)X+(-6)=0";
        String s = formulaService.quadratic(-3.0, -5.0, -6.0);
        assertEquals(what, s);
    }

    @Test
    void equationRoots_thenCorrect() {
        FormulaServiceImpl formulaService = new FormulaServiceImpl();
        List<Double> what = Arrays.asList(-2.0, -9.0);
        Double a = 1.0;
        Double b = 11.0;
        Double c = 18.0;
        Double d = formulaService.discriminant(a, b, c);
        List<Double> roots = formulaService.equationRoots(a, b, c, d);
        assertIterableEquals(what, roots);
    }

    @Test
    void equationRoots_negativeD_thenThrows() {
        final FormulaServiceImpl formulaService = new FormulaServiceImpl();
        final Double a = 1.0;
        final Double b = 1.0;
        final Double c = 1.0;
        final Double d = formulaService.discriminant(a, b, c);
        assertThrows(ArithmeticException.class, () -> {
            List<Double> roots = formulaService.equationRoots(a, b, c, d);
        });
    }

    @Test
    void calc_thenCorrect() {
        FormulaServiceImpl formulaService = new FormulaServiceImpl();
        List<Double> what = Arrays.asList(-2.0, -9.0);
        Integer a = 1;
        Integer b = 11;
        Integer c = 18;
        Integer whatD = 49;
        String whatQuadratic = "1X^2+11X+18=0";

        CalcSolution calcSolution = formulaService.calc(a, b, c);
        List<Double> roots = calcSolution.getEquationRoots();
        assertIterableEquals(what, roots);
        assertEquals(whatD, calcSolution.getDiscriminant());
        assertEquals(whatQuadratic, calcSolution.getQuadratic());
    }
}
