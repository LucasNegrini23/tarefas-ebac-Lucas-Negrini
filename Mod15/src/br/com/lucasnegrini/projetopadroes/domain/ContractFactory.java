package br.com.lucasnegrini.projetopadroes.domain;

public class ContractFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new FerrariCar(200, "FULL", "RED");
        }else {
            return new AlphaRomeoCar(200, "FULL", "GREY/BLUE");
        }
    }
}
