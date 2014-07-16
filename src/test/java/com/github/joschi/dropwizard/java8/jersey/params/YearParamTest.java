package com.github.joschi.dropwizard.java8.jersey.params;

import org.junit.Test;

import java.time.Year;

import static org.assertj.core.api.Assertions.assertThat;

public class YearParamTest {
    @Test
    public void parsesDateTimes() throws Exception {
        final YearParam param = new YearParam("2012");

        assertThat(param.get())
                .isEqualTo(Year.of(2012));
    }
}
