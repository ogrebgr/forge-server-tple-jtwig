package com.bolyartech.forge.server.tple.jtwig;

import com.bolyartech.forge.server.misc.TemplateEngine;
import com.bolyartech.forge.server.misc.TemplateEngineFactory;


public class JtwigTemplateEngineFactory implements TemplateEngineFactory {
    private final String mTemplatePathPrefix;


    public JtwigTemplateEngineFactory(String templatePathPrefix) {
        mTemplatePathPrefix = templatePathPrefix;
    }


    @Override
    public TemplateEngine createNew() {
        return new JtwigTemplateEngine(mTemplatePathPrefix);
    }
}
