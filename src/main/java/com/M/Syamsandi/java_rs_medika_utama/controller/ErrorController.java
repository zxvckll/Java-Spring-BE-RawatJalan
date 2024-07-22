package com.M.Syamsandi.java_rs_medika_utama.controller;

import com.M.Syamsandi.java_rs_medika_utama.model.WebResponse;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class ErrorController {

  @ExceptionHandler(ConstraintViolationException.class)
  public ResponseEntity<WebResponse<String>> constraintViolationException(ConstraintViolationException exception){
     return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(WebResponse.<String>builder().errors(exception.getMessage()).build());
  }

  @ExceptionHandler(ResponseStatusException.class)
  public ResponseEntity<WebResponse<String>> apiException(ResponseStatusException exception){
    return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(WebResponse.<String>builder().errors(exception.getReason()).build());
  }
}
