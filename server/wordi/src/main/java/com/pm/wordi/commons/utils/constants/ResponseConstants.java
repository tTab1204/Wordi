package com.pm.wordi.commons.utils.constants;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseConstants {

    public static final ResponseEntity<Void> OK =
            ResponseEntity.ok().build();

    public static final ResponseEntity<Void> CREATED =
            ResponseEntity.status(HttpStatus.CREATED).build();

    public static final ResponseEntity<Void> BAD_REQUEST =
            ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

//    public static final ResponseEntity<String> DUPLICATION_EMAIL =
//            new ResponseEntity<>("중복된 이메일입니다.", HttpStatus.CONFLICT);
}