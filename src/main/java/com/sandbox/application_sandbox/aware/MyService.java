package com.sandbox.application_sandbox.aware;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MyService {

    private final ResourceLoaderAwareExample resourceExample;

    public MyService(
            ResourceLoaderAwareExample resourceExample) {

        this.resourceExample = resourceExample;
    }

    public void run() throws IOException {

        String config =
                resourceExample.readClasspathResource();

        System.out.println(config);
    }
}