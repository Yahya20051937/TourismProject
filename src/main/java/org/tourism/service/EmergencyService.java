package org.tourism.service;

import org.springframework.stereotype.Service;
import org.tourism.constant.EmergencyType;
import org.tourism.dto.AddEmergencyRequest;
import org.tourism.entity.Emergencies;

import java.util.List;
import java.util.Optional;

@Service
public class EmergencyService {

    public void addEmergency(String admin, AddEmergencyRequest addEmergencyRequest){
        // make it auth to keycloak role :ADMIN only
    }

    public List<Emergencies> getAll(){

    }

    public Optional<Emergencies> findClosestByType(EmergencyType e, Location){

    }

}
