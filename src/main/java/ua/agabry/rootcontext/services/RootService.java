package ua.agabry.rootcontext.services;

import org.springframework.context.ApplicationContext;

import java.util.List;

public interface RootService {

    String getClassName();

    Integer getSerialNumber();

    Integer countOfInstance();

    void addConsumer(String className);

    List<String> getConsumers();

    ApplicationContext getAppContext();
}
