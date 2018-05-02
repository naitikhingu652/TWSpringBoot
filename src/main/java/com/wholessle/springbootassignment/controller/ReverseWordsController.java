package com.wholessle.springbootassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wholessle.springbootassignment.service.ReverseWordsService;

/**
 * Created by Naitik Hingu on Apr 27, 2018
 *
 **/
@RestController
public class ReverseWordsController {
	
	@Autowired ReverseWordsService reverseWordsService;
	
	@GetMapping("/api/ReverseWords")
	public ResponseEntity<String> getReverseWords(@RequestParam("sentence") String sentence) {
        return ResponseEntity.ok(reverseWordsService.reverseWords(sentence));
    }

}
