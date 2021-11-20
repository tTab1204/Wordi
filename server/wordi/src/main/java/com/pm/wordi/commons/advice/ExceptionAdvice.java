package com.pm.wordi.commons.advice;

import com.pm.wordi.exception.DecryptException;
import com.pm.wordi.exception.EncryptException;
import com.pm.wordi.exception.user.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exception(Exception e) {
        e.printStackTrace();
        log.error("에러 메세지", e.getMessage());
        return new ResponseEntity<>("등록되지 않은 에러입니다.", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(CertifiedException.class)
    public ResponseEntity<String> notAuthorizedException(CertifiedException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(EncryptException.class)
    public ResponseEntity<String> encryptException(EncryptException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DecryptException.class)
    public ResponseEntity<String> decryptException(DecryptException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoExistEmailException.class)
    public ResponseEntity<String> noExistEmailException(NoExistEmailException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(NotMatchPasswordException.class)
    public ResponseEntity<String> notMatchPasswordException(NotMatchPasswordException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(NoExistUserException.class)
    public ResponseEntity<String> noExistUserException(NoExistUserException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(NotAuthorizedException.class)
    public ResponseEntity<String> notAuthorizedException(NotAuthorizedException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> methodArgumentNotValidException(MethodArgumentNotValidException e) {
        return new ResponseEntity<>(e.getFieldError().getDefaultMessage(), HttpStatus.BAD_REQUEST);
    }




}
