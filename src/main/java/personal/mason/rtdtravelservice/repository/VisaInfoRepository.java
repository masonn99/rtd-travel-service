package personal.mason.rtdtravelservice.repository;


import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import personal.mason.rtdtravelservice.model.Country;
import personal.mason.rtdtravelservice.model.VisaRequirement;

import java.util.List;


public interface VisaInfoRepository extends JpaRepository<Country, Long> {
    List<Country> findByCountry(String country);
    List<Country> findByVisaRequirement(VisaRequirement visaRequirement);
    List<Country> findbyCountryAndVisaRequirement(String country, VisaRequirement visaRequirement);

    @Override
    List<Country> findAll(Sort sort);

}
