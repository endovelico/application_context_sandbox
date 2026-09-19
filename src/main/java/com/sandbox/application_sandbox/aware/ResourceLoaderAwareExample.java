package com.sandbox.application_sandbox.aware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
public class ResourceLoaderAwareExample
        implements ResourceLoaderAware {

    private ResourceLoader resourceLoader;

    /*
     * Spring calls this method automatically because
     * this class implements ResourceLoaderAware.
     */
    @Override
    public void setResourceLoader(
            ResourceLoader resourceLoader) {

        this.resourceLoader = resourceLoader;
    }

    /*
     * Load a resource from the classpath.
     *
     * Example:
     *
     * src/main/resources/
     *     config.txt
     */
    public String readClasspathResource()
            throws IOException {

        Resource resource =
                resourceLoader.getResource(
                        "classpath:config.txt"
                );

        return resource.getContentAsString(
                StandardCharsets.UTF_8
        );
    }

    /*
     * Load a resource from the filesystem.
     */
    public Resource loadFile(String path) {

        return resourceLoader.getResource(
                "file:" + path
        );
    }

    /*
     * Load a resource from a URL.
     */
    public Resource loadUrl(String url) {

        return resourceLoader.getResource(url);
    }
}