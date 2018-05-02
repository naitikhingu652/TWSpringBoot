package com.wholessle.springbootassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wholessle.springbootassignment.exception.InvalidInputException;
import com.wholessle.springbootassignment.service.FibonacciService;

/**
 * Created by Naitik Hingu on Apr 27, 2018
 *
 **/
@RestController
public class FibonacciController {
	
	@Autowired FibonacciService fibonacciService;
	
	@GetMapping("/api/Fibonacci")
	private ResponseEntity<Long> getNthFibonacciNumber(@RequestParam("n") int n) {
		return ResponseEntity.ok(fibonacciService.getNthFibonacciNumber(n));
	}
	
	@ExceptionHandler
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String invalidInputHandler(InvalidInputException ex) {
		return "Enter valid input '/api/Fibonacci?n=[int]";
	}

}
