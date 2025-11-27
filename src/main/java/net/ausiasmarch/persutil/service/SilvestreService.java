package net.ausiasmarch.persutil.service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.ausiasmarch.persutil.entity.SilvestreEntity;
import net.ausiasmarch.persutil.repository.SilvestreRepository;

@Service
public class SilvestreService {

    @Autowired
    SilvestreRepository oSilvestreRepository;

    @Autowired
    AleatorioService oAleatorioService;

    ArrayList<String> alTitulos = new ArrayList<>();
    ArrayList<String> alDescripciones = new ArrayList<>();
    ArrayList<String> alUrls = new ArrayList<>();

    public SilvestreService() {

        // títulos ejemplo
        alTitulos.add("Atardecer en la montaña");
        alTitulos.add("Bosque encantado");
        alTitulos.add("Río cristalino");
        alTitulos.add("Sendero solitario");
        alTitulos.add("Amanecer dorado");
        alTitulos.add("Flores silvestres");
        alTitulos.add("Cumbres nevadas");
        alTitulos.add("Pradera tranquila");
        alTitulos.add("Reflejo en el lago");
        alTitulos.add("Camino entre pinos");
        alTitulos.add("Cascada escondida");
        alTitulos.add("Noche estrellada");
        alTitulos.add("Valle verde");
        alTitulos.add("Horizonte lejano");
        alTitulos.add("Rocas y musgo");
        alTitulos.add("Bruma matutina");
        alTitulos.add("Paisaje otoñal");
        alTitulos.add("Cielo dramático");
        alTitulos.add("Luz entre árboles");
        alTitulos.add("Vista panorámica");

        // descripciones ejemplo
        alDescripciones.add("Imagen tomada en primavera.");
        alDescripciones.add("Lugar aislado, poca luz.");
        alDescripciones.add("Captura con luz dorada.");
        alDescripciones.add("Paisaje natural sin retoques.");
        alDescripciones.add("Perspectiva aérea.");
        alDescripciones.add("Texturas y contrastes.");
        alDescripciones.add("Composición minimalista.");
        alDescripciones.add("Colores vivos y saturados.");
        alDescripciones.add("Toma nocturna con larga exposición.");
        alDescripciones.add("Detalle de la flora local.");
        alDescripciones.add("Vista panorámica impresionante.");
        alDescripciones.add("Escena capturada al amanecer.");
        alDescripciones.add("Ambiente sereno y pacífico.");
        alDescripciones.add("Rincones escondidos de la naturaleza.");
        alDescripciones.add("Efecto de luz natural.");
        alDescripciones.add("Contraste entre luz y sombra.");

        // URLs de ejemplo 
        alUrls.add("https://cdn.pixabay.com/photo/2019/07/10/17/04/loves-4329036_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2016/03/08/20/03/flag-1244648_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2021/03/12/08/51/shorturl-6089108_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2018/04/26/16/39/beach-3352363_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2018/04/26/12/14/travel-3351825_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2016/10/26/19/00/domain-names-1772242_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2020/05/31/16/53/bookmarks-5243253_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2016/03/08/20/03/flag-1244649_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2015/09/30/01/48/turkey-964831_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2013/02/01/18/14/url-77169_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2017/01/28/17/43/fish-2016013_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2013/03/01/18/40/crispus-87928_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2020/09/19/19/37/landscape-5585247_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2017/02/14/03/03/ama-dablam-2064522_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2024/04/08/11/42/doggy-8683291_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2017/08/21/08/42/pegs-2664512_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2019/01/04/22/31/red-rose-on-car-windscreen-3914222_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2018/02/09/16/33/hanger-3141936_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2020/09/19/11/32/red-rose-5584238_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2018/05/18/12/43/rose-3411110_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2024/01/10/11/09/mountain-8499331_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2015/04/23/22/01/mountains-736886_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2023/08/09/15/06/child-8179655_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2020/03/31/10/48/park-4987155_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2018/09/26/07/43/zebra-3703855_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2015/08/25/19/37/hammock-907447_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2020/03/07/12/57/pier-4909703_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2017/07/25/10/36/beauty-2537562_1280.jpg");
        alUrls.add("https://cdn.pixabay.com/photo/2019/01/16/17/26/beach-3936382_1280.jpg");

    }

    public Long rellenaSilvestre(Long numItems) {
        for (long i = 0; i < numItems; i++) {
            SilvestreEntity o = new SilvestreEntity();
            o.setTitulo(alTitulos.get(oAleatorioService.GenerarNumeroAleatorioEnteroEnRango(0, alTitulos.size() - 1)));

            // descripción obligatoria (ya no puede ser null)
            o.setDescripcion(
                alDescripciones.get(
                    oAleatorioService.GenerarNumeroAleatorioEnteroEnRango(0, alDescripciones.size() - 1)
                )
            );

            o.setUrlImagen(alUrls.get(oAleatorioService.GenerarNumeroAleatorioEnteroEnRango(0, alUrls.size() - 1)));
            o.setPublicado(oAleatorioService.GenerarNumeroAleatorioEnteroEnRango(0, 1) == 1);
            o.setFechaCreacion(LocalDateTime.now());
            o.setFechaModificacion(null);

            oSilvestreRepository.save(o);
        }
        return oSilvestreRepository.count();
    }

    // ----------------------------CRUD---------------------------------
    public SilvestreEntity get(Long id) {
        return oSilvestreRepository.findById(id).orElseThrow(() -> new RuntimeException("Silvestre not found"));
    }

    public Long create(SilvestreEntity oSilvestreEntity) {

        if (oSilvestreEntity.getDescripcion() == null || oSilvestreEntity.getDescripcion().isBlank()) {
            throw new RuntimeException("La descripción es obligatoria.");
        }

        oSilvestreEntity.setFechaCreacion(LocalDateTime.now());
        oSilvestreEntity.setFechaModificacion(null);

        oSilvestreRepository.save(oSilvestreEntity);
        return oSilvestreEntity.getId();
    }

    public Long update(SilvestreEntity oSilvestreEntity) {

        if (oSilvestreEntity.getDescripcion() == null || oSilvestreEntity.getDescripcion().isBlank()) {
            throw new RuntimeException("La descripción es obligatoria.");
        }

        SilvestreEntity existing = oSilvestreRepository.findById(oSilvestreEntity.getId())
                .orElseThrow(() -> new RuntimeException("Silvestre not found"));

        existing.setTitulo(oSilvestreEntity.getTitulo());
        existing.setDescripcion(oSilvestreEntity.getDescripcion());
        existing.setUrlImagen(oSilvestreEntity.getUrlImagen());
        existing.setPublicado(oSilvestreEntity.getPublicado());
        existing.setFechaModificacion(LocalDateTime.now());

        oSilvestreRepository.save(existing);
        return existing.getId();
    }

    public Long delete(Long id) {
        oSilvestreRepository.deleteById(id);
        return id;
    }

    public Page<SilvestreEntity> getPage(Pageable oPageable) {
        return oSilvestreRepository.findAll(oPageable);
    }

    public Long count() {
        return oSilvestreRepository.count();
    }
}
