package ua.agabry;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import ua.agabry.rootcontext.RootContextConfig;
import ua.agabry.webcontext.base.BaseWebContextConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class BaseWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Nullable
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootContextConfig.class};
    }

    @Nullable
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{BaseWebContextConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/", "/base"};
    }

    @Override
    protected String getServletName() {
        return "baseConfig";
    }
}
