package br.com.zup.FaceZup.zupper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zuppers")
public class ZupperController {

    @Autowired
    private ZupperService zupperService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Zupper saveZupper(@RequestBody Zupper zupper){
        return zupperService.saveZupper(zupper);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Zupper> allZuppers(){
        return zupperService.allZuppers();
    }

    @GetMapping(path = "/{email}")
    public Zupper findZupperToID(@PathVariable String email){
        return zupperService.findforIdEmail(email);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/{email}")
    public void deleteZupperForId(@PathVariable String email){
        zupperService.deleteZupper(email);

    }

}
