package com.example;

import java.util.Arrays;
import java.util.Optional;

public class ProjectRunner {
    public static void main(String args[]) {
        Optional<String> projectDir = Arrays.stream(args).filter(s -> s.startsWith("--project.dir")).findFirst();
        if (projectDir.isPresent() && projectDir.get().endsWith("java-tutorial")) {
            Greeting.sayHi(projectDir.get().substring(14));
            System.exit(0);
        } else {
            throw new RuntimeException("Project directory not found! Found: " + projectDir.get());
        }
    }
}
