package io.infinityclub.springboot.docker.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Ricky Fung
 */
@RestController
@RequestMapping("/api")
public class EchoController {

    @GetMapping("/echo")
    public ResponseEntity echo() {
        return ResponseEntity.ok(new Date());
    }
}
