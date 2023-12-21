package com.edp.ProyectoFinalJava.controller;

import com.edp.ProyectoFinalJava.moduls.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class TiendaController {
        List<Ropa> ropas = new ArrayList<>();
        List<Electronico> electronicos = new ArrayList<>();
        List<Comestible> comidas = new ArrayList<>();

        ClienteRegular anonimo = new ClienteRegular("anonimo");

        CarritoCompra carritoAnonimo = new CarritoCompra(anonimo);
        public List<Ropa> getListRopa(){
        ropas.add(new Ropa("Musculosa",100.0, 1,"M","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQq46cB1bO3baF8MgvFopN7JUo-Lf4m3qkBw&usqp=CAU"));
        ropas.add(new Ropa("MusculosaDos",100.0, 2,"S","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQq46cB1bO3baF8MgvFopN7JUo-Lf4m3qkBw&usqp=CAU"));
        ropas.add(new Ropa("MusculosaTres",100.0, 3,"L", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQq46cB1bO3baF8MgvFopN7JUo-Lf4m3qkBw&usqp=CAU"));
        ropas.add(new Ropa("MusculosaCuatro",100.0, 4,"XL","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQq46cB1bO3baF8MgvFopN7JUo-Lf4m3qkBw&usqp=CAU"));
        ropas.add(new Ropa("MusculosaCuatro",100.0,5, "XL","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQq46cB1bO3baF8MgvFopN7JUo-Lf4m3qkBw&usqp=CAU"));
        ropas.add(new Ropa("MusculosaCuatro",100.0,6, "XL","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQq46cB1bO3baF8MgvFopN7JUo-Lf4m3qkBw&usqp=CAU"));
        ropas.add(new Ropa("MusculosaCuatro",100.0,7, "XL","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQq46cB1bO3baF8MgvFopN7JUo-Lf4m3qkBw&usqp=CAU"));
        ropas.add(new Ropa("MusculosaCuatro",100.0,8, "XL","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQq46cB1bO3baF8MgvFopN7JUo-Lf4m3qkBw&usqp=CAU"));
        ropas.add(new Ropa("MusculosaCuatro",100.0,9, "XL","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQq46cB1bO3baF8MgvFopN7JUo-Lf4m3qkBw&usqp=CAU"));
        return ropas;
    }

        public List<Electronico> getListElectronico(){
        electronicos.add(new Electronico("Televisor",100.000,1,"Samsung","https://images.samsung.com/is/image/samsung/p6pim/ar/qn55q65bagczb/gallery/ar-qled-q60b-qn55q65bagczb-534377581?$650_519_PNG$"));
        electronicos.add(new Electronico("Televisor",100.000,2,"Samsung","https://images.samsung.com/is/image/samsung/p6pim/ar/qn55q65bagczb/gallery/ar-qled-q60b-qn55q65bagczb-534377581?$650_519_PNG$"));
        electronicos.add(new Electronico("Televisor",100.000,3,"Samsung","https://images.samsung.com/is/image/samsung/p6pim/ar/qn55q65bagczb/gallery/ar-qled-q60b-qn55q65bagczb-534377581?$650_519_PNG$"));
        electronicos.add(new Electronico("Televisor",100.000,4,"Samsung","https://images.samsung.com/is/image/samsung/p6pim/ar/qn55q65bagczb/gallery/ar-qled-q60b-qn55q65bagczb-534377581?$650_519_PNG$"));
        electronicos.add(new Electronico("Televisor",100.000,5,"Samsung","https://images.samsung.com/is/image/samsung/p6pim/ar/qn55q65bagczb/gallery/ar-qled-q60b-qn55q65bagczb-534377581?$650_519_PNG$"));
        electronicos.add(new Electronico("Televisor",100.000,6,"Samsung","https://images.samsung.com/is/image/samsung/p6pim/ar/qn55q65bagczb/gallery/ar-qled-q60b-qn55q65bagczb-534377581?$650_519_PNG$"));
        return electronicos;
    }

        public List<Comestible> getListComestible(){
        comidas.add(new Comestible("Hamburguesa", 100.00,1,"Hamburgesa Simple con Cheddar", "https://images.rappi.com.ar/restaurants_background/3639-1691784350357.jpg"));
        comidas.add(new Comestible("Hamburguesa", 100.00,2,"Hamburgesa Simple con Cheddar", "https://images.rappi.com.ar/restaurants_background/3639-1691784350357.jpg"));
        comidas.add(new Comestible("Hamburguesa", 100.00,3,"Hamburgesa Simple con Cheddar", "https://images.rappi.com.ar/restaurants_background/3639-1691784350357.jpg"));
        comidas.add(new Comestible("Hamburguesa", 100.00,4,"Hamburgesa Simple con Cheddar", "https://images.rappi.com.ar/restaurants_background/3639-1691784350357.jpg"));
        comidas.add(new Comestible("Hamburguesa", 100.00,5,"Hamburgesa Simple con Cheddar", "https://images.rappi.com.ar/restaurants_background/3639-1691784350357.jpg"));
        return comidas;
    }

        public void addToCart(List<Ropa> ropas, int id){
            for (Ropa ropa : ropas) {
                if(ropa.getId() == id){
                    carritoAnonimo.agregarProducto(ropa);
                }
            }
        }

    @GetMapping("/ropa")
    public String home(Model model){
       model.addAttribute("ropas", getListRopa());
        return "ropa";
    }
    @GetMapping("/electronico")
    public String mapElectronico(Model model){
        model.addAttribute("electronicos", getListElectronico());
        return "electronico";
    }
    @GetMapping("/comida")
    public String mapComida(Model model){
        model.addAttribute("comidas", getListComestible());
        return "comestible";
    }

}
