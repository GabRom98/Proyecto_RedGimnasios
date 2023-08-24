package ProyectoATLbootcamp.Proyecto_RedGimnasios.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "subscriptions")
public class Suscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "start_subscription", nullable = false)
    private Date start_suscription;

    @Column(name = "end_subscription",nullable = false)
    private Date end_suscription;

    @Column(name = "is_active", nullable = false)
    private Boolean is_active;

    @OneToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "subscription_type", nullable = false)
    private SuscriptionType suscriptionType;
}