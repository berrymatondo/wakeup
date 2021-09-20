package com.wakeup.wakeup.resume;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resume {

    private Long resumeId;
    private String date;
    private String category;
    private String reference;
    private String texte;
    private String theme;
    private String message;
    private boolean tag = false;

    /*
     * @JsonIgnore
     * 
     * @ManyToOne
     * 
     * @JoinColumn(name = "orateur_id") private Orateur orateur;
     */
    // private Orateur orateur;

    // @Transient
    private Long orateurId;

    private String firstname;

    private String lastname;
}
