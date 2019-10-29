package com.example.demoapp;

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ApplicationController {

    private static final Random RANDOM = new Random();
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationController.class);

    final private int drawBound;

    ApplicationController(@Value("${draw.bound}") int drawBound) {
        this.drawBound = drawBound;
    }

    @GetMapping("draw")
    int drawRandom() {
        int randomValue = RANDOM.nextInt(drawBound);
        LOG.debug("Drawn {}", randomValue, drawBound);
        return randomValue;
    }
}
