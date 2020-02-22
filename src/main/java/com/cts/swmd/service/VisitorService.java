package com.cts.swmd.service;

import com.cts.swmd.exception.InvalidVisitorException;
import com.cts.swmd.model.Visitor;

public interface VisitorService {
	Visitor computeAge(Visitor visitor);
	boolean isValid(Visitor visitor) throws InvalidVisitorException;
}
