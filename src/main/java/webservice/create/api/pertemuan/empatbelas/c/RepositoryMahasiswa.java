/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webservice.create.api.pertemuan.empatbelas.c;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pascal
 */
@Repository
public interface RepositoryMahasiswa extends JpaRepository<Mahasiswadata, Integer>{
    
//    public boolean existsBydata(String nama, String nim, String programstudi, String universitas);
//    
////    public boolean existsBynama(String nama);
////    
////    public boolean existsBynim(String nim);
////    
////    public boolean existsByprogramstudi(String programstudi);
////    
////    public boolean existsByuniversitas(String universitas);
//    
//    public boolean existsByid(int id);
    
}
