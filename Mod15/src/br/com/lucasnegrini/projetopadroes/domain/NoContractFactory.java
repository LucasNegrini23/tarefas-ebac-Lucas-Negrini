package br.com.lucasnegrini.projetopadroes.domain;

public class NoContractFactory  extends Factory{

    @Override
    Car retrieveCar(String requestedGrade) {
        if ("B".equals(requestedGrade)) {
            return new JeepCar(170,"FULL", "WHITE");
        } else {
            return new FiatUnoCar(150, "HALF Fuel", "PURPLE");
        }
    }
}
