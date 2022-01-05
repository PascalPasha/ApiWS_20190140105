/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webservice.create.api.pertemuan.empatbelas.c;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author pascal
 */

@RestController
@RequestMapping(value = "/datamhs")
public class DatabaseController {

    @Autowired
    RepositoryMahasiswa repositoryMahasiswa;
    
    @PostMapping(value = "/addnewmhs")
    public Mahasiswadata addnewmhs(@RequestBody Mahasiswadata param)
    {
        repositoryMahasiswa.save(param);
        return param;
    }  
    
    @GetMapping(value = "/getallmhs")
    public List<Mahasiswadata> getallmhs()
    {
        return repositoryMahasiswa.findAll();
    }
    
    @GetMapping(value = "/getmhsbyid")
    public Mahasiswadata getmhsbyid(@RequestParam int id)
    {
        return repositoryMahasiswa.findById(id).get();
    }
    
    @PutMapping(value = "/updatemhs")
    public Mahasiswadata updatemhs(@RequestBody Mahasiswadata param)
    {
        return repositoryMahasiswa.save(param);
    }
    
    @DeleteMapping(value = "/deletemhs")
    public List <Mahasiswadata> deletemhs(@RequestParam int id)
    {
        repositoryMahasiswa.deleteById(id);
        List<Mahasiswadata> mhslist = repositoryMahasiswa.findAll();
        return mhslist;
    }
}
    

//    @RequestMapping("/keloladatamhs")
//    @ResponseBody
//    public List<Mahasiswadata> getMahasiswaData()
//    {
//        List<Mahasiswadata> mahasiswadata = new ArrayList<>();
//        
//        MahasiswadataJpaController controller = new MahasiswadataJpaController();
//        
//        try{
//            mahasiswadata = controller.findMahasiswadataEntities();
//        }catch(Exception e){}
//        
//        return mahasiswadata;
//    }



//   @GetMapping("/data")
//  public ResponseEntity<List<Mahasiswadata>> getAllTutorials(@RequestParam(required = false) String nama) {
//    try {
//      List<Mahasiswadata> mahasiswadata = new ArrayList<Mahasiswadata>();
//
//      if (nama == null)
//        repositoryMahasiswa.findAll().forEach(mahasiswadata::add);
//      else
//        repositoryMahasiswa.findAll().forEach(mahasiswadata::add);
//
//      if (mahasiswadata.isEmpty()) {
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//      }
//
//      return new ResponseEntity<>(mahasiswadata, HttpStatus.OK);
//    } catch (Exception e) {
//      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//  }
//
//     @GetMapping("/data/{id}")
//  public ResponseEntity<Mahasiswadata> getTutorialById(@PathVariable("id") long id) {
//    Optional<Mahasiswadata> mahasiswadatasatu = repositoryMahasiswa.findById(id);
//
//    if (mahasiswadatasatu.isPresent()) {
//      return new ResponseEntity<>(mahasiswadatasatu.get(), HttpStatus.OK);
//    } else {
//      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//  }
//
////     @PostMapping("/data")
////  public ResponseEntity<Mahasiswadata> createTutorial(@RequestBody Mahasiswadata mahasiswadatadua) {
////    try {
////      Mahasiswadata _mahasiswa = repositoryMahasiswa
////          .save(new Mahasiswadata(mahasiswadatadua.getNama(), mahasiswadatadua.getNim(), mahasiswadatadua.getProgramstudi(), mahasiswadatadua.getUniversitas(), false);
////      return new ResponseEntity<>(_mahasiswa, HttpStatus.CREATED);
////    } catch (Exception e) {
////      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
////    }
////  }
//
//    @PutMapping("/data/{id}")
//  public ResponseEntity<Mahasiswadata> updateTutorial(@PathVariable("id") long id, @RequestBody Mahasiswadata mahasiswa) {
//    Optional<Mahasiswadata> mahasiswadatasatu = repositoryMahasiswa.findById(id);
//
//    if (mahasiswadatasatu.isPresent()) {
//      Mahasiswadata _mahasiswa = mahasiswadatasatu.get();
//      _mahasiswa.setNama(mahasiswa.getNama());
//      _mahasiswa.setNim(mahasiswa.getNim());
//      _mahasiswa.setProgramstudi(mahasiswa.getProgramstudi());
//      _mahasiswa.setUniversitas(mahasiswa.getUniversitas());
//      return new ResponseEntity<>(repositoryMahasiswa.save(_mahasiswa), HttpStatus.OK);
//    } else {
//      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//  }
//  
//  
//  @DeleteMapping("/data/{id}")
//  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
//    try {
//      repositoryMahasiswa.deleteById(id);
//      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    } catch (Exception e) {
//      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//  }
//
//  @DeleteMapping("/tutorials")
//  public ResponseEntity<HttpStatus> deleteAllTutorials() {
//    try {
//      repositoryMahasiswa.deleteAll();
//      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    } catch (Exception e) {
//      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//  }


