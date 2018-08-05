package com.uglyOrgan.jsonToDB.service;

import com.uglyOrgan.jsonToDB.model.Disc;
import com.uglyOrgan.jsonToDB.repository.DiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiscService {

    @Autowired
    private DiscRepository discRepository;

    DiscService(DiscRepository discRepository){
        this.discRepository = discRepository;
    }

    public List<Disc> getDiscs(){
        List<Disc> discs;
        discs = discRepository.findAll();
        return discs;
    }

    public void addDisc(Disc disc){
        discRepository.save(disc);
    }

    public Disc getDisc(long id){
        return discRepository.getOne(id);
    }

    public Disc getDisc(String name){
        return discRepository.findByDiscName(name).get(0);
    }

    public List<Disc> getDrivers(){
        return discRepository.findAll().stream().filter(disc ->
                disc.getDiscType().equals("Driver")).sorted().collect(Collectors.toList());
    }

    public List<Disc> getMidranges(){
        return discRepository.findAll().stream().filter(disc ->
                (disc.getDiscType().equals("Fairway Driver")) || disc.getDiscType().equals("Midrange")).collect(Collectors.toList());
    }

    public List<Disc> getPutters(){
        return discRepository.findAll().stream().filter(disc ->
                disc.getDiscType().equals("Putter")).collect(Collectors.toList());
    }
}
