package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.UtestDatos;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Responder;
import tasks.Llenar;
import tasks.LlenarDireccion;
import tasks.LlenarDispositivos;
import tasks.LlenarFinal;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static tasks.AbrirPaginaUtest.AbrirPaginaUtest;

public class UtestStepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Ricardo quiere registrarse en la plataforma de Utest")
    public void ricardoQuiereRegistrarseEnLaPlataformaDeUtest() {
        theActorCalled("Ricardo").wasAbleTo(
                AbrirPaginaUtest());
    }
    @When("El usuario ingresa toda la información requerida por la pagina")
    public void elUsuarioIngresaTodaLaInformaciónRequeridaPorLaPagina(List<UtestDatos>datos) {
     OnStage.theActorInTheSpotlight().attemptsTo(Llenar.laPagina(datos), LlenarDireccion.laPagina(datos),
             LlenarDispositivos.laPagina(datos), LlenarFinal.laPagina(datos));
    }
    @Then("El registro se completa cuando aparece el boton Complete Setup")
    public void elRegistroSeCompletaCuandoApareceElBotonCompleteSetup(List<UtestDatos>datos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.alos(datos)));
    }
}
