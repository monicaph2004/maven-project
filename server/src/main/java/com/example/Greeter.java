package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Para evitar el warning, ponemos un comentario. Muestra Hola.
   * @param	someone Nombre de la persona
   * @return	Devuelve el saludo
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
