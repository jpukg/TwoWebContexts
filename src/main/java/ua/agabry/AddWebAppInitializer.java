package ua.agabry;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import ua.agabry.rootcontext.RootContextConfig;
import ua.agabry.webcontext.add.AddWebContextConfig;

import javax.servlet.ServletRegistration;

public class AddWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Nullable
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Nullable
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AddWebContextConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/add"};
    }

    @Override
    protected String getServletName() {
        return "addConfig";
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setLoadOnStartup(2);
    }
}
