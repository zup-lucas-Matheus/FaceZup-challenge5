package br.com.zup.FaceZup.zupper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zuppers")
public class ZupperController {

    @Autowired
    private ZupperService zupperService;

}
