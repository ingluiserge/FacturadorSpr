package com.facturador.FacturadorRest.Repositorys;

import com.facturador.FacturadorRest.Dto.response.MovementResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import static com.facturador.FacturadorRest.Repositorys.queries.MovementsQueries.GET_RESUME;

public interface MovementResponseRepository extends JpaRepository<MovementResponse, Integer> {

    @Query(nativeQuery = true, value = GET_RESUME)
    List<MovementResponse> getResume(@Param("id") String productId);
}
