package br.com.zup.FaceZup.zupper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<Zupper> AllZuppers(){
        return (List<Zupper>) zupperRepository.findAll();
    }


}
