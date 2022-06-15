package me.yeonyu.bmw.cheat_coding.model.esysLauncher;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
public class Cafd {

    private String id;
    private String name;
    private String author;
    private List<String> seriesList;
    private String series;
    private List<Code> code;

}
