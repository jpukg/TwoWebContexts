# TwoWebContexts
Example of Spring MVC application with more than one DispatcherServlet.

BaseWebAppInitializer.class - configures both root context and base web context 
AddWebAppInitializer.class - configures additional web context with own controllers, view resolvers, services, etc. but it uses the same root context

Root context should contain instances of shared services (DAO, repositories, authorization, etc.)
