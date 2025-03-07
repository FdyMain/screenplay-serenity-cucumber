package com.fdymain.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class playTrendingMusic {



    @When("el usuario navega a la sección de Tendencias")
    public void elUsuarioNavegaALaSecciónDeTendencias() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Uno");
    }
    @And("el usuario selecciona la pestaña de Música")
    public void elUsuarioSeleccionaLaPestañaDeMúsica() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Dos");
    }
    @And("el usuario da clic en la primera canción de la lista")
    public void elUsuarioDaClicEnLaPrimeraCanciónDeLaLista() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Tres");
    }
    @Then("el usuario debe ver el título de la canción reproducida")
    public void elUsuarioDebeVerElTítuloDeLaCanciónReproducida() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cuatro");
    }


}
