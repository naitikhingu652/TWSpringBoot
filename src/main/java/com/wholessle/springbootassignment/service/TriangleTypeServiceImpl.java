package com.wholessle.springbootassignment.service;

import org.springframework.stereotype.Service;

import com.wholessle.springbootassignment.domain.TriangleTypeEnum;

/**
 * Created by Naitik Hingu on Apr 27, 2018
 *
 **/
@Service
public class TriangleTypeServiceImpl implements TriangleTypeService {

	@Override
	public String getTriangleType(int a, int b, int c) {
		if(a < 0 || b < 0 || c < 0 || a >= b+c || c >= b+a || b >= a+c)
			return TriangleTypeEnum.INVALID.toString();
		else if(a == b && b == c)
			return TriangleTypeEnum.EQUILATERAL.toString();
		else if(a == b || b == c || c == a)
			return TriangleTypeEnum.ISOSCELES.toString();
		else
			return TriangleTypeEnum.SCALENE.toString();
	}

	
	
}
