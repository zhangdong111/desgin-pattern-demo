package com.zhang.design.patterns.creator.prototype.example1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sender {

    private String name;

    private String email;

}
