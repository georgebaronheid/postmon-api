package br.com.postmon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CityDetails {

    @JsonProperty("area_km2")
    String squareMetersArea;

    @JsonProperty("codigo_ibge")
    String ibgeCode;

    public String getSquareMetersArea() {
        return squareMetersArea;
    }

    public void setSquareMetersArea(String squareMetersArea) {
        this.squareMetersArea = squareMetersArea;
    }

    public String getIbgeCode() {
        return ibgeCode;
    }

    public void setIbgeCode(String ibgeCode) {
        this.ibgeCode = ibgeCode;
    }
}
