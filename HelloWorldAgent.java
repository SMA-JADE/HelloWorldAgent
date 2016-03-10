import jade.core.Agent;

public class HelloWorldAgent extends Agent {
  protected void setup (){
    //imprime en pantalla mensaje de bienvenida
    System.out.println("Hello World. I'm an agent!");
    //imprime en pantalla el identificador del agente
    System.out.println("My local-name is "+getAID().getLocalName());

    //Imprimir información adicional del agente. Investigar las demás operaciones de la clase jade.core.AID e implementarlas, por ejemplo el método getName
    // Línea de código aquí

    //Cambiarle de nombre al agente e imprimirlo en pantalla
    // Líneas de código aquí


    // Make this agent terminate
  	doDelete();
  }
}
