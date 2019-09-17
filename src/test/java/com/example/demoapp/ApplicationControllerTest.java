package com.example.demoapp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationControllerTest {

    @Test
    public void drawsNumber() {
        ApplicationController applicationController = new ApplicationController(1);

        int drawnValue = applicationController.drawRandom();

        assertThat(drawnValue).isEqualTo(0);
    }

}
