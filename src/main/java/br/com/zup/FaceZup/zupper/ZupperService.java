package br.com.zup.FaceZup.zupper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ZupperService {

    @Autowired
    private ZupperRepository zupperRepository;

    //Cadastrando zuppers.
    public Zupper saveZupper(Zupper zupper){
        return zupperRepository.save(zupper);
    }

    //Visualizar Todos os Zuppers.
    public List<Zupper> allZuppers(){
        return (List<Zupper>) zupperRepository.findAll();
    }

    //Encontrar zupper pelo ID email.
    public Zupper findforIdEmail(String email){
        return zupperRepository.findById(email)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Zupper não encontrado"));


    }


}
