package com.wholessle.springbootassignment.service;

import org.springframework.stereotype.Service;

/**
 * Created by Naitik Hingu on Apr 27, 2018
 *
 **/
@Service
public class FibonacciServiceImpl implements FibonacciService {

	@Override
	public Long getNthFibonacciNumber(int n) {
		long fibo[] = new long[n+1];
		
		fibo[0] = 0;
		if(n > 0) {
			fibo[1] = 1;
			
			for(int i = 2; i <= n; i++) {
				fibo[i] = fibo[i - 1] + fibo[i - 2];
			}
		}
		
		return fibo[n];
	}

}
