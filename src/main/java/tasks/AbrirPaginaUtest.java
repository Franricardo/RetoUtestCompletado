package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import static userinterface.PaginaUtest.*;
import net.serenitybdd.screenplay.Task;

public class AbrirPaginaUtest implements Task {
    private userinterface.PaginaUtest paginaUtest;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(paginaUtest),
                Click.on(BUTTON_JOIN_TODAY)
        );
    }

    public static AbrirPaginaUtest AbrirPaginaUtest() {
        return Tasks.instrumented(AbrirPaginaUtest.class);
    }
}



