package com.helpdesk.microservicio.historial.models;
import jakarta.persistence.*;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
@Entity
@Table(name = "historial")
public class Historial implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name="descripcion")
    private String descripcion;
    @Column (name="idTecnico")
    private String resueltoPor;
    @Column (name="idTicket")
    private String ticket;
    @Column (name="documento")
    private String documento;

/*
    @OneToMany(mappedBy = "creadoPor", cascade = CascadeType.ALL)
    private List<Ticket> creaTickets;

    @OneToMany(mappedBy = "creadoPorUsuario", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

*/
}

