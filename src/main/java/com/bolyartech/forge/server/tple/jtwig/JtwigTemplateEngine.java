package com.bolyartech.forge.server.tple.jtwig;

import com.bolyartech.forge.server.misc.TemplateEngine;
import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;
import org.jtwig.environment.EnvironmentConfiguration;

import java.util.HashMap;
import java.util.Map;


public class JtwigTemplateEngine implements TemplateEngine {
    private final String mTemplatePathPrefix;
    private final EnvironmentConfiguration mEnv;
    private final Map<String, Object> mAttributes = new HashMap<>();


    public JtwigTemplateEngine(String templatePathPrefix, EnvironmentConfiguration env) {
        mTemplatePathPrefix = templatePathPrefix;
        mEnv = env;
    }


    @Override
    public void assign(String varName, Object object) {
        mAttributes.put(varName, object);
    }


    @Override
    public String render(String templateName) {
        String viewName = mTemplatePathPrefix + templateName;
        JtwigTemplate template = JtwigTemplate.classpathTemplate(viewName, mEnv);
        JtwigModel model = JtwigModel.newModel(mAttributes);
        return template.render(model);
    }
}
