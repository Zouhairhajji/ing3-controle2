/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.zouhair.repositories;

import fr.zouhair.entities.UtilisateurEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author zouhairhajji
 */
public interface UtilisateurRepository extends CrudRepository<UtilisateurEntity, Long>{
    
}
