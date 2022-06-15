package me.yeonyu.bmw.cheat_coding.model.esysPlus;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
public class CustomKeys {

    private Translations translations;
    private List<Keys> keys;

}
