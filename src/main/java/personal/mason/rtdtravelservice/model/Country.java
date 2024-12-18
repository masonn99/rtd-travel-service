package personal.mason.rtdtravelservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;

    @Enumerated(EnumType.STRING)
    private VisaRequirement visaRequirement;
    private String duration;
    private String notes;

}
