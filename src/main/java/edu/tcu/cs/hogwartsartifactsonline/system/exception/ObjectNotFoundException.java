package edu.tcu.cs.hogwartsartifactsonline.system.exception;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectNotFoundException extends RuntimeException{
    public ObjectNotFoundException(String objectName, String id){super("Could not find " + objectName + " with Id " + id + " :(");}


    public ObjectNotFoundException(String objectName, Integer id){super("Could not find " + objectName + " with Id " + id + " :(");}
}
