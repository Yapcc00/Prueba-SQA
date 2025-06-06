Feature: Manejo del carrito de compras en la tienda en línea de Floristería Mundo Flor

  @compraUno
  Scenario: Agregar dos productos de la categoria Amor al carrito
    Given que el usuario ingresa a la pagina principal de Floristeria Mundo Flor
    When accede a la seccion Amor desde el menu de categorias
    And agrega el primer producto disponible al carrito
    And agrega un segundo producto diferente al carrito
    Then el carrito debe reflejar un total de dos productos

  @compraDos
  Scenario: Agregar y eliminar un producto de la categoria Cumpleaños
    Given que el usuario se encuentra en la pagina principal de Floristeria Mundo Flor
    When navega a la categoria Cumpleaños
    And selecciona un producto y lo añade al carrito
    Then el carrito debe mostrar un producto agregado
    When el usuario decide eliminar ese producto del carrito
    Then el carrito debe quedar vacio
