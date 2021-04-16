package com.zhang.design.patterns.creator.prototype.example1;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Receiver {

    private String name;

    private String email;

}
