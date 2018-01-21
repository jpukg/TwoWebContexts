package ua.agabry.webcontext.base.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.agabry.rootcontext.services.RootService;
import ua.agabry.webcontext.common.WebService;

@Controller
public class BaseHomeController {

    private RootService rootService;
    private WebService webService;

    @Autowired
    public BaseHomeController(RootService rootService, WebService webService) {
        rootService.addConsumer(this.getClass().getSimpleName());
        this.rootService = rootService;

        webService.addConsumer(this.getClass().getSimpleName());
        this.webService = webService;
    }

    @GetMapping(value = {"/", "/base"})
    public String getHome(ModelMap modelMap) {
        modelMap.addAttribute("controllerClassName", this.getClass().getSimpleName());

        modelMap.addAttribute("rootServiceClass", rootService.getClassName());
        modelMap.addAttribute("rootServiceClassCntInstance", rootService.countOfInstance());
        modelMap.addAttribute("rootServiceClassInstanceNumber", rootService.getSerialNumber());
        modelMap.addAttribute("ConsumersOfRootServiceClassInstance", rootService.getConsumers());
        modelMap.addAttribute("rootServiceClassAppContext", rootService.getAppContext());

        modelMap.addAttribute("webServiceClass", webService.getClassName());
        modelMap.addAttribute("webServiceClassCntInstance", webService.countOfInstance());
        modelMap.addAttribute("webServiceClassInstanceNumber", webService.getSerialNumber());
        modelMap.addAttribute("ConsumersOfWebServiceClassInstance", webService.getConsumers());
        modelMap.addAttribute("webServiceClassAppContext", webService.getAppContext());

        return "home";
    }
}
