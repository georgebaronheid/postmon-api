package br.com.postmon.service;

import br.com.postmon.model.Address;
import br.com.postmon.model.CityDetails;
import br.com.postmon.model.StateDetails;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest(classes = Address.class)
@RunWith(SpringRunner.class)
public class ConsumerApiPostmonServiceTest {

    @Autowired
    private ConsumerApiPostmonService consumerApiPostmonService;

    @Test
    public void consumerTest() {
        Address address = consumerApiPostmonService.consumer("40020160");

        CityDetails cityDetails = address.getCityDetails();
        StateDetails stateDetails = address.getStateDetails();

        assertEquals("Centro", address.getNeighborhood());
        assertEquals("Salvador", address.getCity());


        assertEquals("564.732,642", stateDetails.getSquareMetersArea());
        assertEquals("29", stateDetails.getIbgeCode());
        assertEquals("Bahia", stateDetails.getName());

        assertEquals("40020160", address.getPostalCode());
        assertEquals("692,819", cityDetails.getSquareMetersArea());
        assertEquals("2927408", cityDetails.getIbgeCode());
        assertEquals("BA", address.getState());
    }
}
