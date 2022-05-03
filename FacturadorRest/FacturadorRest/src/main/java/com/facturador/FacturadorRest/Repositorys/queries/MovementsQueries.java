package com.facturador.FacturadorRest.Repositorys.queries;

public class MovementsQueries {

    public static final String GET_RESUME = """
            SELECT
            	mov.id as id,
                pro.nombre_producto as product_description,
                mov.cantidad as cantidad
            FROM movimiento mov
            JOIN producto pro ON mov.id_producto = pro.id_producto
            WHERE pro.id_producto = :id
    """;
}
