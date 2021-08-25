package br.com.zup.FaceZup.models;

import br.com.zup.FaceZup.enums.Cargo;
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


    @Id
    private String email;
    private String nome;
    private String sobrenome;
    private Cargo cargo;

}
