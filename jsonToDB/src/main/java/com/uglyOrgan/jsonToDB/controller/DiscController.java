package com.uglyOrgan.jsonToDB.controller;

import com.uglyOrgan.jsonToDB.model.Disc;
import com.uglyOrgan.jsonToDB.service.DiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/discs")
public class DiscController {
    @Autowired
    private DiscService discService;

    @GetMapping
    public List<Disc> list(){
        return discService.getDiscs();
    }

    @GetMapping("/drivers")
    public List<Disc> listDrivers(){
        return discService.getDrivers();
    }

    @GetMapping("/midranges")
    public List<Disc> listMidranges(){
        return discService.getMidranges();
    }

    @GetMapping("/putters")
    public List<Disc> listPutters(){
        return discService.getPutters();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void add(@RequestBody Disc disc){
        discService.addDisc(disc);
    }

    @GetMapping("/{id}")
    public Disc getDisc(@PathVariable("id") long id){
        return discService.getDisc(id);
    }

    @GetMapping("/name")
    public Disc getDisc(@RequestParam(value="name") String name){
        return discService.getDisc(name);
    }
}
