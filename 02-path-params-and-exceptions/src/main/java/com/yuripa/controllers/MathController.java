package com.yuripa.controllers;

import com.yuripa.exception.UnsupportedMathOperationException;
import com.yuripa.math.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.yuripa.request.converters.NumberConverter.convertToDouble;
import static com.yuripa.request.converters.NumberConverter.isNotNumeric;

@RestController
@RequestMapping("/math")
public class MathController {

    private final SimpleMath math = new SimpleMath();

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        if (isNotNumeric(numberOne) || isNotNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a numeric value.");
        }

        return math.sum(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        if (isNotNumeric(numberOne) || isNotNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a numeric value.");
        }

        return math.subtraction(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        if (isNotNumeric(numberOne) || isNotNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a numeric value.");
        }

        return math.multiplication(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        if (isNotNumeric(numberOne) || isNotNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a numeric value.");
        }

        return math.division(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping("/average/{numberOne}/{numberTwo}")
    public Double average(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        if (isNotNumeric(numberOne) || isNotNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a numeric value.");
        }

        return math.average(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping("/square-root/{number}")
    public Double squareRoot(
            @PathVariable("number") String number
    ) {
        if (isNotNumeric(number)) {
            throw new UnsupportedMathOperationException("Please, set a numeric value.");
        }

        return math.squareRoot(convertToDouble(number));
    }
}
