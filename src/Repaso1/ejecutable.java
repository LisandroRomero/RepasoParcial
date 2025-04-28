/*package Repaso1;

import java.util.Date;

public class ejecutable {
    public static void main(String[] args) {

        // 1. Crear el cine
        Cine cine = new Cine("Cinemark XD", "Av. Siempre Viva 742");

        // 2. Crear salas
        Sala sala1 = new Sala(1, 100);
        SalaVIP salaVIP = new SalaVIP(2, 50, "Butacas Premium, Comida Gratis");

        cine.agregarSala(sala1);
        cine.agregarSala(salaVIP);

        // 3. Crear película y función
        Pelicula pelicula = new Pelicula("Inception", Genero.ACCION);
        Funcion funcion = new Funcion("20:00", pelicula);
        sala1.agregarFuncion(funcion);

        // 4. Crear cliente y cliente VIP
        Cliente clienteNormal = new Cliente("Pedro Pérez", "pedro@gmail.com");
        ClienteVIP clienteVip = new ClienteVIP("Lucía López", "lucia@gmail.com", 10.0f);

        // 5. Cliente compra entrada
        Entrada entrada = new Entrada(2000.0, "Fila 5 - Asiento 10");
        funcion.agregarEntrada(entrada);

        // 6. Realizar venta
        Venta venta = new Venta(new Date(), clienteVip);
        Pago pago = new Pago(2000.0, TipoPago.TARJETA);
        venta.agregarPago(pago);
        cine.agregarVenta(venta);

        // 7. Comprar insumos
        Proveedor proveedor = new Proveedor("Distribuidora Popcorn", "555-1234", "Calle 8 #23");
        Insumo insumo = new Insumo("Popcorn", 500.0);
        Compra compra = new Compra(new Date());
        compra.agregarInsumo(insumo);
        cine.agregarCompra(compra);

        // 🎬 Imprimir lo que hicimos
        System.out.println("Cine: " + cine.getNombre());
        System.out.println("Cliente VIP: " + clienteVip.getNombre() + " - Descuento: " + clienteVip.getDescuento() + "%");
        System.out.println("Película: " + pelicula.getTitulo() + " - Función: " + funcion.getHorario());
        System.out.println("Entrada vendida: $" + entrada.getPrecio());
        System.out.println("Pago realizado con: " + pago.getTipo());
        System.out.println("Insumo comprado: " + insumo.getNombre() + " a proveedor: " + proveedor.getNombre());
    }
}*/
