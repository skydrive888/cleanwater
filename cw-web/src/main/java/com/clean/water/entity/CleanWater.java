package com.clean.water.entity;

import com.clean.water.dto.CleanWaterResponse;
import com.clean.water.repo.CleanWaterRepository;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "clean_water")
public class CleanWater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productId;

    private String managementAgency;
    private String manufacturerName ;
    private String equipmentName ;
    private String yearOfInspection;
    private String quarterOfInspection ;
    private String samplingDate ;
    private String inspectionStatus ;
    private String inspectionDate ;
    private String lowTemperatureGeneralBacteria ;
    private String mediumTemperatureGeneralBacteria ;
    private String totalColiformBacteria ;
    private String fecalColiformBacteria ;
    private String pseudomonasAeruginosa ;
    private String salmonella ;
    private String shigella ;
    private String sulfateReducingAnaerobicBacteria ;

    private String lead ;

    private String fluoride ;
    private String arsenic ;
    private String selenium ;
    private String mercury ;
    private String cyanide ;
    private String chromium ;
    private String ammoniaNitrogen ;
    private String nitrateNitrogen ;
    private String cadmium ;
    private String boron ;
    private String phenol ;
    private String diazinon ;
    private String parathion ;
    private String fenitrothion ;
    private String carbaryl ;
    private String trichloroethylene ;
    private String tetrachloroethylene ;
    private String trichloroethane ;
    private String dichloromethane ;
    private String benzene ;
    private String toluene ;
    private String ethylbenzene ;
    private String xylene ;

//    @Column(name = "'1-1_dichloroethylene'")
//    private String dichloroethylene;

    private String carbonTetrachloride;

//    @Column(name = "'1-2-dibromo-3-chloropropane'")
//    private String dibromoChloropropane;

    private String manganeseOxideConsumption ;
    private String odor ;
    private String copper ;
    private String color ;
    private String detergent ;
    private String hydrogenIonConcentration ;
    private String zinc ;
    private String chlorineIon ;
    private String turbidity ;
    private String sulfateIon ;
    private String aluminum ;
    private String uranium;

    public CleanWaterResponse toCleanWaterResponse() {
        return new CleanWaterResponse(manufacturerName);
    }
}
