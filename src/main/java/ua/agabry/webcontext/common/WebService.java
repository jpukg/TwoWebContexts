package ua.agabry.webcontext.common;

import org.springframework.context.ApplicationContext;

import java.util.List;

public interface WebService {

    String getClassName();

    Integer getSerialNumber();

    Integer countOfInstance();

    void addConsumer(String className);

    List<String> getConsumers();

    ApplicationContext getAppContext();
}
