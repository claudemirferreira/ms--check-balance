package br.com.setebit.checkbalance.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "client")
public class Client {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_CLIENT")
    @SequenceGenerator(sequenceName = "S_CLIENT", allocationSize = 1, name = "S_CLIENT")
    @Id
    @Column(name = "cli_id")
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "email", length = 100)
    private String email;

    @OneToMany(mappedBy="client")
    private Set<Account> acconts;

}
