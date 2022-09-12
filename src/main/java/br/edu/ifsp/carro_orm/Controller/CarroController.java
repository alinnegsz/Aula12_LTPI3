package main.java.br.edu.ifsp.carro_orm.Controller;

import java.util.List;

import main.java.br.edu.ifsp.carro_orm.Model.Carro;
import main.java.br.edu.ifsp.carro_orm.Repository.CarroRepository;

@RestController
@CrossOrigin
public class CarroController {
    @Autowired // permite que o spring crie objetos gerenciados por ele
    CarroRepository carroRepository;

    @PostMapping("/carro")
    public void adicionaCarro(@RequestBody Carro novoCarro){
        carroRepository.save(novoCarro);
    }

    @GetMapping("/carro")
    public List<Carro> recuperaCarros(){
        return (List<Carro>) carroRepository.findAll();
    }
}
