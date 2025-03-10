package com.syamsandi.java_rs_rawat_jalan.service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Set;

@Service
public class ValidatorServiceImpl implements ValidatorService {

  @Autowired
  private Validator validator;


  @Override
  public void validate(Object request) {
    Set<ConstraintViolation<Object>> constraintViolations = validator.validate(request);
    if (constraintViolations.size() != 0) {
      throw new ConstraintViolationException(constraintViolations);
    }

  }
}
