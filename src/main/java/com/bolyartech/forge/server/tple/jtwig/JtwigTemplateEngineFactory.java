package com.bolyartech.forge.server.tple.jtwig;

import com.bolyartech.forge.server.misc.TemplateEngine;
import com.bolyartech.forge.server.misc.TemplateEngineFactory;
import org.jtwig.environment.DefaultEnvironmentConfiguration;
import org.jtwig.environment.EnvironmentConfiguration;
import org.jtwig.parser.JtwigParser;


public class JtwigTemplateEngineFactory implements TemplateEngineFactory {
    private final String mTemplatePathPrefix;
    private final EnvironmentConfiguration mEnv;


    public JtwigTemplateEngineFactory(String templatePathPrefix, EnvironmentConfiguration env) {
        mTemplatePathPrefix = templatePathPrefix;
        mEnv = env;
    }


    public JtwigTemplateEngineFactory(String templatePathPrefix) {
        this(templatePathPrefix, new DefaultEnvironmentConfiguration());
    }


    @Override
    public TemplateEngine createNew() {
        return new JtwigTemplateEngine(mTemplatePathPrefix, mEnv);
    }
}
