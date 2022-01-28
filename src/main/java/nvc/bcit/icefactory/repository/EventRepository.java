package nvc.bcit.icefactory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.bcit.icefactory.model.Event;

public interface EventRepository extends JpaRepository <Event,Integer> {
    
}
