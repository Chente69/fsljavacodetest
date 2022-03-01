package co.fullstacklabs.cuboid.challenge.service;

import co.fullstacklabs.cuboid.challenge.dto.CuboidDTO;
import co.fullstacklabs.cuboid.challenge.model.Cuboid;

import java.util.List;

/**
 * @author FullStack Labs
 * @version 1.0
 * @since 2021-10-22
 */
public interface CuboidService {
    CuboidDTO create(CuboidDTO cuboid);

    List<CuboidDTO> getAll();
   
    void delete(Long cuboID);
    
    CuboidDTO getCuboidById(Long cuboID);
    
    Cuboid update(Long cuboidID, Cuboid cuboid);
}
