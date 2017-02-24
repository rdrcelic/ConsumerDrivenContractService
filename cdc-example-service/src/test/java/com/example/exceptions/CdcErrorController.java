package com.example.exceptions;

import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Test error controller that is suppose to return custom error messages
 *
 * @author rdrcelic
 * @since 24/02/17
 */
@ControllerAdvice
public class CdcErrorController extends BasicErrorController {

    public CdcErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes, new ErrorProperties());
    }

    @Override
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
        CdcException exception = new CdcException("error.greeting.not_found", (String)request.getAttribute(RequestDispatcher.ERROR_MESSAGE), HttpStatus.BAD_REQUEST.value());
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("errorCode", "error.greeting.not_found");
        params.put("message", (String)request.getAttribute(RequestDispatcher.ERROR_MESSAGE));
        params.put("status", HttpStatus.BAD_REQUEST.value());
        ResponseEntity<Map<String, Object>> responseEntity = ResponseEntity.badRequest().body(params);
        return responseEntity;
    }
}
