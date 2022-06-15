package me.yeonyu.bmw.cheat_coding.model.esysLauncher;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
public class Code {

    private String description;
    private List<String> seriesList;
    private String series;
    private List<Group> group;

}
