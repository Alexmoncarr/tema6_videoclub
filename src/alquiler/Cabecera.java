package alquiler;

import cliente.Cliente;

import java.util.Date;

public class Cabecera extends Alquiler_pelicula {

    Cliente cliente;
    Date fecha_entrega;


    public Cabecera() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
}
