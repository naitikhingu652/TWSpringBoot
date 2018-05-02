package com.wholessle.springbootassignment.service;

import java.util.Stack;

import org.springframework.stereotype.Service;

import com.wholessle.springbootassignment.exception.InvalidInputException;

/**
 * Created by Naitik Hingu on Apr 27, 2018
 *
 **/
@Service
public class ReverseWordsServiceImpl implements ReverseWordsService {

	@Override
	public String reverseWords(String sentence) {
		if(sentence == null || sentence.isEmpty())
			throw new InvalidInputException();
		else {
			Stack<Character> stack = new Stack<Character>();
			String result = "";
			
			for(int i = 0; i < sentence.length(); i++) {
				if(sentence.charAt(i) != ' ')
					stack.push(sentence.charAt(i));
				else {
					while(stack.empty() == false)
						result += stack.pop();
					result += " ";
				}
			}
			
			while(stack.empty() == false)
				result += stack.pop();
			
			return result;
		}
	}
}
