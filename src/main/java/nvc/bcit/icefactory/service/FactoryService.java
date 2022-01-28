package nvc.bcit.icefactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.bcit.icefactory.repository.CameraRepository;
// import nvc.bcit.icefactory.repository.CameraRepository;
// import nvc.bcit.icefactory.repository.EventRepository;
import nvc.bcit.icefactory.repository.FactoryRepository;
import nvc.bcit.icefactory.model.Camera;
import nvc.bcit.icefactory.model.Factory;

@Service
public class FactoryService {

  
    @Autowired
    FactoryRepository factoryRepository ; 

    @Autowired
    CameraRepository cameraRepository ; 
    

    public List <Factory> findAll(){
        return factoryRepository.findAll();
    }
    

    public Factory getById(int id ){
        return factoryRepository.getById(id);
    }


    public Camera getByName(String name) {
        return cameraRepository.getByName(name);
    }

}
