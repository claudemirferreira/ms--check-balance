package br.com.setebit.checkbalance.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "account")
public class Account {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_ACCOUNT")
    @SequenceGenerator(sequenceName = "S_ACCOUNT", allocationSize = 1, name = "S_ACCOUNT")
    @Id
    @Column(name = "acc_id")
    private Long id;

    private float balance;

    @Column(name = "type", length = 30)
    private String type;

    @ManyToOne
    @JoinColumn(name = "cli_id")
    private Client client;

}
