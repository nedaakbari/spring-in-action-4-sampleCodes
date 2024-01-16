package org.example.conditional.autowiredAmbiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AnotherClass {
    private Dessert dessert;

//    @Autowired
//    @Qualifier("iceCream")
//    public void setDessert(Dessert dessert) {
//        this.dessert = dessert;
//    }

    @Autowired
    @Cold
    @Creamy
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
