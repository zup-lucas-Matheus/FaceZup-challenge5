package br.com.zup.FaceZup.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "zuppers")
public class Zupper {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String email;
    private String nome;
    private String sobrenome;

}
