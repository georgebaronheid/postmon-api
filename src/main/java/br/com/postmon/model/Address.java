package br.com.postmon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Address {

    @JsonProperty("bairro")
    String neighborhood;

    @JsonProperty("cidade")
    String city;

    @JsonProperty("estado_info")
    StateDetails stateDetails;

    @JsonProperty("cep")
    String postalCode;

    @JsonProperty("cidade_info")
    CityDetails cityDetails;


    @JsonProperty("estado")
    String state;

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public StateDetails getStateDetails() {
        return stateDetails;
    }

    public void setStateDetails(StateDetails stateDetails) {
        this.stateDetails = stateDetails;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public CityDetails getCityDetails() {
        return cityDetails;
    }

    public void setCityDetails(CityDetails cityDetails) {
        this.cityDetails = cityDetails;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

