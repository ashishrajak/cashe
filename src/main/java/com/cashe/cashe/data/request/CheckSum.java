package com.cashe.cashe.data.request;

import jakarta.validation.Valid;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class CheckSum {
    @NotNull(message = "field not be blank partner_nam")
            @NotBlank(message = "field not be blank partner_nam")
    String partner_name;
    @NotNull(message = "field not be blank mobile_no")
            @NotBlank(message = "field not be blank mobilenumber")
    String mobile_no;
    @NotNull(message = "field not be blank emailId")
            @NotBlank(message = "field not be blank email")
    String emailId;



}
