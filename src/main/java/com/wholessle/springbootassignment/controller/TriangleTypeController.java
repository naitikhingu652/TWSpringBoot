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
import com.wholessle.springbootassignment.service.TriangleTypeService;

/**
 * Created by Naitik Hingu on Apr 27, 2018
 *
 **/
@RestController
public class TriangleTypeController {

	@Autowired TriangleTypeService triangleTypeService;
	
	@GetMapping("/api/TriangleType")
    public ResponseEntity<String> getTriangleType(@RequestParam("a") int a, @RequestParam("b") int b, @RequestParam("c") int c) {
        return ResponseEntity.ok(triangleTypeService.getTriangleType(a, b, c));
    }
	
	@ExceptionHandler
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String invalidInputHandler(InvalidInputException ex) {
		return "Enter valid input '/api/TriangleType?a=[int]&b=[int]&c=[int]'";
	}
}
