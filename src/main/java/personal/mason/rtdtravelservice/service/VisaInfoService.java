package personal.mason.rtdtravelservice.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import personal.mason.rtdtravelservice.model.Country;
import personal.mason.rtdtravelservice.model.VisaRequirement;
import personal.mason.rtdtravelservice.repository.VisaInfoRepository;

import java.util.List;

@Service
@Transactional
public class VisaInfoService {
    private final VisaInfoRepository visaInfoRepository;
    public VisaInfoService(VisaInfoRepository visaInfoRepository) {
        this.visaInfoRepository = visaInfoRepository;
    }

    public List<Country> getCountries(String country) {
        return visaInfoRepository.findByCountry(country);
    }

    public List<Country> findByVisaRequirement(VisaRequirement visaRequirement) {
        return visaInfoRepository.findByVisaRequirement(visaRequirement);
    }

    public List<Country> findbyCountryAndVisaRequirement(String country, VisaRequirement visaRequirement) {
        return visaInfoRepository.findbyCountryAndVisaRequirement(country, visaRequirement);
    }

    public List<Country> findAll() {
        return visaInfoRepository.findAll();
    }

}
