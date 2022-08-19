package com.cyrilselyanin.soapws.service;

import javax.jws.WebService;
import java.util.Arrays;
import java.util.List;

@WebService(serviceName = "FormulaService", portName = "Formula", name =
        "Formula", endpointInterface = "com.cyrilselyanin.soapws.service.FormulaService",
        targetNamespace = "http://cyrilselyanin.com/service/soap-ws")
public class FormulaServiceImpl implements FormulaService {
    /**
     * {@inheritDoc}
     */
    @Override
    public List<Double> calc(Integer a, Integer b, Integer c) {
        // Автоупаковка из double в Double
        Double ad = a.doubleValue();
        Double bd = b.doubleValue();
        Double cd = c.doubleValue();
        // Вычисление дискриминанта
        Double d = discriminant(ad, bd, cd);
        // Вычисление корней уравнения
        List<Double> roots = equationRoots(ad, bd, cd, d);
        return roots;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String quadratic(Double a, Double b, Double c) {
        String astr = String.format(a > 0.0 ? "%d" : "(%d)", a.intValue());
        String bstr = String.format(b > 0.0 ? "%d" : "(%d)", b.intValue());
        String cstr = String.format(c > 0.0 ? "%d" : "(%d)", c.intValue());

        return String.format(
                "%sX^2+%sX+%s=0",
                astr,
                bstr,
                cstr
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double discriminant(Double a, Double b, Double c) {
        return b * b - 4.0 * a * c;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Double> equationRoots(Double a, Double b, Double c, Double d) {
        if (d > 0.0) {
            Double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            Double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            return Arrays.asList(r1, r2);
        }
        if (d == 0.0) {
            Double r1 = -b / (2.0 * a);
            return Arrays.asList(r1);
        }
        throw new ArithmeticException(
                String.format(
                        "Roots aren't real for %s, with discriminant %d",
                        quadratic(a, b, c),
                        d.intValue()
                )
        );
    }
}
