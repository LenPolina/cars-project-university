package com.implemica.storage.controller;


import com.implemica.storage.model.CarStorage;
import com.implemica.storage.service.StorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/storage")
public class StorageController {

    private final StorageService storageService;

    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<CarStorage> getCarNumber(@PathVariable("id") Long carId){
        CarStorage carPrice = storageService.getCarNumber(carId);
        return new ResponseEntity<>(carPrice, HttpStatus.CREATED);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<String> addCarNumber(@RequestBody CarStorage carStorage){
        storageService.save(carStorage);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(value = "/edit")
    public ResponseEntity<String> editCarNumber(@RequestBody CarStorage carStorage){
        storageService.save(carStorage);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping (value = "/delete/{id}")
    public ResponseEntity<String> deleteCarNumber(@PathVariable("id") Long carId){
        storageService.delete(carId);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping(value = "/delete/car/{id}")
    public ResponseEntity<String> deleteCarAmount(@PathVariable("id") Long carId, @RequestBody Long amountToDelete){
        storageService.deleteCarAmount(carId, amountToDelete);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
