package com.practice.demo.advice;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class HandleGlobalException {
    @ExceptionHandler(exception = MethodArgumentNotValidException.class)
    public Map<String,Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exception){
        return exception.getBindingResult().getFieldErrors().stream().collect(Collectors.toMap(
                FieldError::getField,
                error->error.getDefaultMessage()
          ));
    }
}
