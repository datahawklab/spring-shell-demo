package com.example.demo.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class HelloCommand {

    @ShellMethod(key = "hello", value = "This command prints hello")
    public String hello() {
        return "Hello!";
    }
}