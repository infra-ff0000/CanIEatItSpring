/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.aeteris.JSONPOJOs;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.IOException;
import java.util.List;


public class JacksonDeserialize {

    public static class ModelClass {

        private String name;

        public ModelClass() { 
        }

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public ModelClass(final String name) {
            super();
            this.name = name;
        }

        @Override
        public String toString() {
            return "ModelClass [name=" + name + "]";
        }

    }

    public static class ListModelClass {

        private List<ModelClass> list;

        @JsonDeserialize(contentAs = ModelClass.class)
        public void setList(final List<ModelClass> list) {
            this.list = list;
        }

        @Override
        public String toString() {
            return "ListModelClass [list=" + list + "]";
        }

    }

    public static void main(final String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.readValue("{\"list\":[{\"name\":\"name1\"},{\"name\":\"name2\"}]}",
                ListModelClass.class));
    }

}