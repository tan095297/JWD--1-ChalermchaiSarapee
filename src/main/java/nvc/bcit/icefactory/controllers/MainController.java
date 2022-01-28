package nvc.bcit.icefactory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import nvc.bcit.icefactory.model.Factory;
import nvc.bcit.icefactory.repository.CameraRepository;
import nvc.bcit.icefactory.repository.EventRepository;

import nvc.bcit.icefactory.service.FactoryService;

@Controller
public class MainController {

    @Autowired
    FactoryService factoryService ;

    @Autowired
    CameraRepository cameraRepository;

    @Autowired
    EventRepository eventRepository;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    // @GetMapping("/factory")
    // public String getFactories(){
    //     return "factory";
    // }

    @GetMapping("/factory")
    public ModelAndView factory(){
        List<Factory> factories = factoryService.findAll();
        return new ModelAndView("factory","factories",factories);
    }

    // @GetMapping("/factory/{id}")
    // public String getFactory(){
    //     return "factory-detail";
    // }

    @GetMapping("/factory/{id}")
    public ModelAndView getFactory(@PathVariable int id){
        Factory factories = factoryService.getById(id);
        return new ModelAndView("factory-detail","factories",factories);
    }

    // @GetMapping("/factory/{id}")
    // public ModelAndView getCamera(@PathVariable String name){
    //     Camera cameras = factoryService.getByName(name);
    //     return new ModelAndView("factory-detail","cameras",cameras);
    // }

    // @GetMapping("/factory/{id}")
    // public ModelAndView getEvent(@PathVariable int id){
    //     Event factory = factoryService.getById(id);
    //     return new ModelAndView("factory-detail","factory",factory);
    // }
}
