package com.schiphol.alpha.web.controllers;

import com.schiphol.alpha.persistence.entity.Sample;
import com.schiphol.alpha.persistence.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author Veeramani Bagavathi
 *         Since 12/10/2016
 */
@RestController
@RequestMapping(value = "/api/sample/")
public class SampleRestController {
    @Autowired
    private ExampleRepository exampleRepository;

    @RequestMapping(value = "add/{property}", method = GET)
    public Sample create(@PathVariable("property") String propertyValue) {
        Sample sample = new Sample();
        sample.setExampleProperty(propertyValue);
        return exampleRepository.save(sample);
    }

    @RequestMapping(method = GET)
    public List<Sample> getAll() {
        return exampleRepository.findAll();
    }
}
