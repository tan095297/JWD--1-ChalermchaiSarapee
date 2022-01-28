package nvc.bcit.icefactory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.bcit.icefactory.model.Camera;

public interface CameraRepository extends JpaRepository<Camera,Integer>{

    Camera getByName(String name);
    
}
