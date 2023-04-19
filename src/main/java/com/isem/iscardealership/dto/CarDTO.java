package com.isem.iscardealership.dto;

import com.isem.iscardealership.model.Brand;
import com.isem.iscardealership.model.EngineType;
import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class CarDTO {
    private long id;
    private Brand brand;
    private int horsePower;
    private int price;
    private EngineType engineType;
}
