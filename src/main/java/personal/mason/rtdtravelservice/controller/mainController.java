package personal.mason.rtdtravelservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import personal.mason.rtdtravelservice.model.Country;
import personal.mason.rtdtravelservice.model.VisaRequirement;
import personal.mason.rtdtravelservice.service.VisaInfoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class mainController {

    private final VisaInfoService visaInfoService;

    @Autowired
    public mainController(VisaInfoService visaInfoService) {
        this.visaInfoService = visaInfoService;
    }

    @GetMapping("/countries")
    public List<Country> getCountries(String country) {
        return visaInfoService.getCountries(country);
    }

    @GetMapping("/visaRequirement")
    public List<Country> findByVisaRequirement(@RequestParam VisaRequirement visaRequirement) {
        return visaInfoService.findByVisaRequirement(visaRequirement);
    }

    @GetMapping("/search")
    public List<Country> findbyCountryAndVisaRequirement(@RequestParam String country, @RequestParam VisaRequirement visaRequirement) {
        return visaInfoService.findbyCountryAndVisaRequirement(country, visaRequirement);
    }

    @GetMapping("/all")
    public List<Country> findAll() {
        return visaInfoService.findAll();
    }
}
