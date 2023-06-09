package com.isep.hometrade.map;

import com.isep.hometrade.business.AddressEntity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HousingDto {

    @NotEmpty(message = "Le nom renseigné n''est pas valide !")
    private String name;

    @NotEmpty(message = "La description renseignée n''est pas valide !")
    private String description;

    @NotEmpty(message = "Le type renseigné n''est pas valide !")
    private String type;

}
