package com.implemica.application.repository;

import com.implemica.application.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Car entity.
 */

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    String QUERY_TO_GET_URL = "SELECT car_image_url FROM car WHERE id = :id";

    /**
     * Gets an image url by the car id.
     * @param id car id to find link to the image
     * @return link to the image
     */
    @Query(value = QUERY_TO_GET_URL, nativeQuery = true)
    String getCarImageUrlById(@Param("id") Long id);
}
