package com.fenlan.stream.starter.web.controller;

import com.fenlan.stream.starter.common.param.LogParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fenlan
 */
@RestController
@RequestMapping("/log")
public class LogController {

    @RequestMapping(value = "/push", method = RequestMethod.POST)
    public ResponseEntity<String> push(@RequestBody LogParam logParam) {
        System.out.println(logParam);
        return new ResponseEntity<>(HttpStatus.OK.getReasonPhrase(), HttpStatus.OK);
    }
}
