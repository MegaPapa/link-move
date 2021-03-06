package com.nhl.link.move.resource;

import com.nhl.link.move.LmRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

/**
 * A {@link ResourceResolver} that reads files from CLASSPATH.
 *
 * @since 2.4
 */
public class ClasspathResourceResolver implements ResourceResolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClasspathResourceResolver.class);

    @Override
    public Reader reader(String name) {

        if (!name.endsWith(".xml")) {
            complainOfExtension(name);
            name = name + ".xml";
        }

        URL resource = ClasspathResourceResolver.class.getClassLoader().getResource(name);
        if (resource == null) {
            throw new LmRuntimeException("Extractor config not found in classpath: " + name);
        }

        try {
            return new InputStreamReader(resource.openStream(), "UTF-8");
        } catch (IOException e) {
            throw new LmRuntimeException("Error reading classpath extractor config XML", e);
        }
    }

    /**
     * @param name
     * @deprecated since 2.4
     */
    @Deprecated
    private void complainOfExtension(String name) {
        LOGGER.warn("*** Implicit extension name is deprecated. Use '{}.xml' instead of '{}'", name, name);
    }
}
