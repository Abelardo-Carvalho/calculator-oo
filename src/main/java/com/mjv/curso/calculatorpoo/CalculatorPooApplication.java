package com.mjv.curso.calculatorpoo;

import com.mjv.curso.calculatorpoo.service.CalculatorService;
import com.mjv.curso.calculatorpoo.utils.CalculatorUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorPooApplication.class, args);

		CalculatorUtils calcUtils = new CalculatorUtils();

		calcUtils.initCalc();


	}

}
