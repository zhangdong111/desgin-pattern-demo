package com.zhang.design.patterns.creator.prototype.example3;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Receiver implements  Cloneable{

    private String name;

    private String email;

    @Override
    public Receiver clone() throws CloneNotSupportedException {
        Receiver clone = (Receiver) super.clone();
        clone.name = new String(this.name);
        return clone;
    }


}
