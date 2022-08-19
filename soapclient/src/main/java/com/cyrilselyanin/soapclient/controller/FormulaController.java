package com.cyrilselyanin.soapclient.controller;

import com.cyrilselyanin.soapclient.dto.RestCalcResponse;
import com.cyrilselyanin.soapclient.dto.gen.CalcSolution;
import com.cyrilselyanin.soapclient.service.formulaclient.FormulaClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.ws.soap.SoapFaultException;
import org.springframework.ws.soap.client.SoapFaultClientException;

/**
 * Контроллер для SOAP-сервиса
 */
@RestController
public class FormulaController {
    // Инициализация через инъекцию зависимостей
    private final FormulaClient formulaClient;

    public FormulaController(FormulaClient formulaClient) {
        this.formulaClient = formulaClient;
    }

    /**
     * Метод контроллера, обращающийся в SOAP-сервису
     * @param a Коэффициент 1
     * @param b Коэффициент 2
     * @param c Свободный член
     * @return Решение уравнения либо бросается исключение
     */
    @GetMapping(path = "/calc")
    public RestCalcResponse calc(@RequestParam Integer a, @RequestParam Integer b, @RequestParam Integer c) {
        RestCalcResponse restCalcResponse = new RestCalcResponse();

        try {
            CalcSolution calcSolution = formulaClient.calcSolution(a, b, c).getReturn();
            restCalcResponse.setEquationRoots(calcSolution.getEquationRoots());
            restCalcResponse.setQuadratic(calcSolution.getQuadratic());
            restCalcResponse.setDiscriminant(calcSolution.getDiscriminant());
        } catch (SoapFaultException | SoapFaultClientException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);
        }
        return restCalcResponse;
    }
}
