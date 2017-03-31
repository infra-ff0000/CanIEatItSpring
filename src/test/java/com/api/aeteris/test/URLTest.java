/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.aeteris.test;

import com.api.aeteris.controller.DietUser;
import com.api.aeteris.controller.DietUserPK;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.json.JacksonTester;

/**
 *
 * @author ariazavocki
 */
public class URLTest{

    private JacksonTester<DietUserPK> json;

    @Before
    public void setup() {
        ObjectMapper objectMapper = new ObjectMapper(); 
        //mapping JSON object for marshalling
        JacksonTester.initFields(this, objectMapper);
    }

    @Test
    public void serializeJson() throws IOException {
        DietUserPK details = 
            new DietUser("Marie", "3");

        assertThat(this.json.write(details))
            .isEqualToJson("DietUser.json");

        assertThat(this.json.write(details))
            .hasJsonPathStringValue("@.name");

        assertThat(this.json.write(details))
            .extractingJsonPathStringValue("@.name")
            .isEqualTo("Jaime");
    }

    @Test
    public void deserializeJson() throws IOException {
        String content = "{\"name\":\"Jaime\",\"id\":\"1\"}";

        assertThat(this.json.parse(content))
            .isEqualTo(new DietUser("Sarah", "2"));

        assertThat(this.json.parseObject(content).getFirstName())
            .isEqualTo("Sugar free");
    }

}